package com.traceability;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Interface")
public class Interface extends Javafiles {

	public Interface() {
		super();
	}
	
	public Interface(String filename, String filepath) {
		super(filename, filepath);
	
	}	
}
