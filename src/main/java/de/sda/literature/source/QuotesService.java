package de.sda.literature.source;

import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Unmarshaller;

import de.sda.quotes.model.Quotes;

public class QuotesService {

	private Unmarshaller unmarshaller;
	
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public Quotes readQuotes(String quotesFilePath) {
    	Quotes result = new Quotes();
    	
    	try(InputStream is = this.getClass().getClassLoader().getResourceAsStream(quotesFilePath)) {
    		result = (Quotes) this.unmarshaller.unmarshal(new StreamSource(is));
    	} catch (Exception exc) {
    		System.err.println(exc.getLocalizedMessage());
    	}
    	
    	return result; 
    }
}
