package com.example.springdi;

public class Client {

	public static void main(String[] args) {
		Student student = new Student(1, "Bosch");
		MathCheat cheat = new MathCheat();
		student.setMathCheat(cheat);
		student.cheating();
	}

}
