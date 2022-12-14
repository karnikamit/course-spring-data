package io.springworks.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id		//Business key annotation
	private int rollNumber;
	private String name;
	private String score;

	public Student() {
	}

	public Student(int rollNumber, String name, String score) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.score = score;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}
