package com.springwithmongo.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Courses {
	@Id
	private String _id;
	private String Name;
	private String Code;
	private int PassMark;
	private float Total;
	private String [] Subjects;
	
	public String getID() {
		return _id;
	}
	public void setID(String iD) {
		_id = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public int getPassMark() {
		return PassMark;
	}
	public void setPassMark(int passMark) {
		PassMark = passMark;
	}
	public float getTotal() {
		return Total;
	}
	public void setTotal(float total) {
		Total = total;
	}
	public String[] getSubjects() {
		return Subjects;
	}
	public void setSubjects(String[] subjects) {
		Subjects = subjects;
	}
	
}
