package de.sda.literature;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;

public interface LiteratureGenerator {

	void generateWork(AbstractApplicationContext context) throws IOException;
}
