package com.traceability;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Javafiles")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="FileType",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="JavaFile")
public class Javafiles {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="record_id")
	private Integer id;
	
	private String filename;
	private String filepath;
	
	public Javafiles() {
		super();
	}
	public Javafiles(String filename, String filepath) {
		super();
		this.filename = filename;
		this.filepath = filepath;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	@Override
	public String toString() {
		return "Javafiles [id=" + id + ", filename=" + filename + ", filepath=" + filepath + "]";
	}
	
}
