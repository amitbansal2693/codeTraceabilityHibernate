package com.traceability;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Junit")
public class TestFiles extends Javafiles{

	public TestFiles() {
		super();
	}
	
	public TestFiles(String filename, String filepath) {
		super(filename, filepath);
	
	}
}
