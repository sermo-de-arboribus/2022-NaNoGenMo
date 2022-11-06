package de.sda.novel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.sda.literature.LiteratureGenerator;

public class NovelGeneratorApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LiteratureGenerator novelGenerator = context.getBean(NovelGenerator.class);
		
		novelGenerator.generateWork();
		
		context.close();
	}
}
