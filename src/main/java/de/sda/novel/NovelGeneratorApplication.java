package de.sda.novel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NovelGeneratorApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		NovelGenerator novelGenerator = context.getBean(NovelGenerator.class);
		
		novelGenerator.generateWork();
		
		context.close();
	}
}
