package de.sda.literature.source;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Unmarshaller;

import de.sda.nlp.analyze.Wordnet;
import de.sda.quotes.model.LexicalResource;
import de.sda.quotes.model.LexicalResource.Lexicon;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry.Sense;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset;

public class LexicalResourceService {

private Unmarshaller unmarshaller;
	
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public Wordnet loadLexicon(String quotesFilePath) {
    	LexicalResource resource = new LexicalResource();
    	
    	try(InputStream is = this.getClass().getClassLoader().getResourceAsStream(quotesFilePath)) {
    		resource = (LexicalResource) this.unmarshaller.unmarshal(new StreamSource(is));
    	} catch (Exception exc) {
    		exc.printStackTrace();
    		System.err.println(exc.getLocalizedMessage());
    	}
    	
    	Map<String, LexicalEntry> lexicalEntryMap = new HashMap<String, LexicalEntry>();
    	Map<String, Synset> synsetMap = new HashMap<String, Synset>();
    	
    	for(Lexicon lexicon : resource.getLexicons()) {
    		
    		for(Synset synset : lexicon.getSynsets()) {
    			String id = synset.getId();
    			synsetMap.put(id, synset);
    		}
    		
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
    	
    	return new Wordnet(lexicalEntryMap, synsetMap); 
    }
}
