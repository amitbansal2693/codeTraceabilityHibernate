package com.traceability;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="DAO")
public class DAO extends Javafiles{

	public DAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DAO(String filename, String filepath) {
		super(filename, filepath);
	
	}

}
