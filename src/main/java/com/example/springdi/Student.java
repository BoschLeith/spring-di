package com.example.springdi;

public class Student {

	private String studentName;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayInfo(){
		System.out.println("Student name is: " + studentName);
	}
}
