package com.wrapper;

public class Student {
	
	
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, Integer marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	private int rollno;
	private String name;
	private Integer marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
