package com.example.springdi;

public class Student {

	private int id;
	private String studentName;

	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayInfo(){
		System.out.println("Student name is: " + studentName);
		System.out.println("Student ID is: " + id);
	}

}
