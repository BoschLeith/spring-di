package com.example.springdi;

public class Student {

	private int id;
	private String studentName;
	private MathCheat mathCheat;

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public void displayInfo() {
		System.out.println("Student name is: " + studentName);
		System.out.println("Student ID is: " + id);
	}

	public void cheating() {
		mathCheat.mathCheat();
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
}
