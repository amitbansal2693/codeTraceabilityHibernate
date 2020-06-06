package com.traceability;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Service")
public class Service extends Javafiles{

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Service(String filename, String filepath) {
		super(filename, filepath);
	
	}
}
