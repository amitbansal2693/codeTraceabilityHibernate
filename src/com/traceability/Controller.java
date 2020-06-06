package com.traceability;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Controller")
public class Controller extends Javafiles{

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Controller(String filename, String filepath) {
		super(filename, filepath);
		// TODO Auto-generated constructor stub
	}

	
}
