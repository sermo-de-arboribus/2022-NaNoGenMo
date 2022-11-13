package de.sda.literature.source;

import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Unmarshaller;

import de.sda.quotes.model.LexicalResource;

public class LexicalResourceService {

private Unmarshaller unmarshaller;
	
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public LexicalResource loadLexicon(String quotesFilePath) {
    	LexicalResource result = new LexicalResource();
    	
    	try(InputStream is = this.getClass().getClassLoader().getResourceAsStream(quotesFilePath)) {
    		result = (LexicalResource) this.unmarshaller.unmarshal(new StreamSource(is));
    	} catch (Exception exc) {
    		System.err.println(exc.getLocalizedMessage());
    	}
    	
    	return result; 
    }
}
