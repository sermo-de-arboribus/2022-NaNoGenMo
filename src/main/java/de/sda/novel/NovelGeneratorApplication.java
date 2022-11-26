package de.sda.novel;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import de.sda.literature.LiteratureGenerator;

public class NovelGeneratorApplication {

	public static void main(String[] args) throws IOException {
		
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		LiteratureGenerator novelGenerator = context.getBean(NovelGenerator.class);
		
		novelGenerator.generateWork(context);
		
		context.close();
	}
}
