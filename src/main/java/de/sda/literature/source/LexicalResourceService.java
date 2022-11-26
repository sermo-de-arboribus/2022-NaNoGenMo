package de.sda.literature.source;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.oxm.Unmarshaller;

import de.sda.nlp.analyze.Wordnet;
import de.sda.quotes.model.LexicalResource;
import de.sda.quotes.model.LexicalResource.Lexicon;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry.Sense;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset;

public class LexicalResourceService {

    private Logger logger = LoggerFactory.getLogger(LexicalResourceService.class);
	private Unmarshaller unmarshaller;
	
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public Wordnet loadLexicon(Resource lexicalResource) {
    	
    	LexicalResource resource = unmarshalResource(lexicalResource);
    	Map<String, LexicalEntry> lexicalEntryMap = new HashMap<String, LexicalEntry>();
    	Map<String, Synset> synsetMap = new HashMap<String, Synset>();
    	
    	for(Lexicon lexicon : resource.getLexicons()) {
    		populateSynsetMap(synsetMap, lexicon);
    		populateLexicalEntryMap(lexicalEntryMap, synsetMap, lexicon);
    	}
    	
    	return new Wordnet(lexicalEntryMap, synsetMap); 
    }

	private void populateLexicalEntryMap(Map<String, LexicalEntry> lexicalEntryMap, Map<String, Synset> synsetMap,
			Lexicon lexicon) {

		for(LexicalEntry entry : lexicon.getLexicalEntries()) {
			String lemma = entry.getLemma().getWrittenForm();
			lexicalEntryMap.put(lemma, entry);
			
			for(Sense sense : entry.getSenses()) {
				String synsetId = ((Synset)sense.getSynset()).getId();
				Synset synset = synsetMap.get(synsetId);
				if(null != synset) {
					synset.getMembers().add(entry);
				}    				
			}
		}
	}

	private void populateSynsetMap(Map<String, Synset> synsetMap, Lexicon lexicon) {
		for(Synset synset : lexicon.getSynsets()) {
			String id = synset.getId();
			synsetMap.put(id, synset);
		}
	}

	private LexicalResource unmarshalResource(Resource lexicalResource) {
    	LexicalResource resource = new LexicalResource();
    	
		try(InputStream is = lexicalResource.getInputStream()) {
    		resource = (LexicalResource) this.unmarshaller.unmarshal(new StreamSource(is));
    	} catch (Exception exc) {
    		logger.error(exc.getLocalizedMessage(), exc);
    	}
		
		return resource;
	}
}
