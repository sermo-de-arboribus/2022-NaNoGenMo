package de.sda.literature.source;

import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.oxm.Unmarshaller;

import de.sda.quotes.model.Quotes;

public class QuotesService {

	private Unmarshaller unmarshaller;
	
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public Quotes readQuotes(String quotesFilePath, ApplicationContext appContext) {
    	Quotes result = new Quotes();
    	
    	try(InputStream is = appContext.getResource(quotesFilePath).getInputStream()) {
    		result = (Quotes) this.unmarshaller.unmarshal(new StreamSource(is));
    	} catch (Exception exc) {
    		System.err.println(exc.getLocalizedMessage());
    	}
    	
    	return result; 
    }
}
