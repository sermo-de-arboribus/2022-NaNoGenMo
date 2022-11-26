package de.sda.literature.source;

import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.oxm.Unmarshaller;

import de.sda.quotes.model.Quotes;

public class QuotesService {

	private Unmarshaller unmarshaller;
    private Logger logger = LoggerFactory.getLogger(QuotesService.class);
	
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public Quotes readQuotes(String quotesFilePath, ApplicationContext appContext) {
    	Quotes result = new Quotes();
    	
    	try(InputStream is = appContext.getResource(quotesFilePath).getInputStream()) {
    		result = (Quotes) this.unmarshaller.unmarshal(new StreamSource(is));
    	} catch (Exception exc) {
    		logger.error(exc.getLocalizedMessage());
    	}
    	
    	return result; 
    }
}
