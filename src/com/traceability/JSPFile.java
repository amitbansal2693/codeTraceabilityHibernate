package com.traceability;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JSPFile")
public class JSPFile {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="record_id")
	private Integer id;
	
	@Column(name="JSPName")
	private String filename;
	@Column(name="JSPPath")
	private String filepath;
	
	public JSPFile() {
		super();
	}
	public JSPFile(String filename, String filepath) {
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
