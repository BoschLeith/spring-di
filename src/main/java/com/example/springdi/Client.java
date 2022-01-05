package com.example.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		// Manual object injection
		//Student student = new Student(1, "Bosch");
		// MathCheat cheat = new MathCheat();
		// student.setMathCheat(cheat);
		// student.cheating();

		// Spring object injection
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml loaded");
		Student student = context.getBean("student", Student.class);
		student.displayInfo();
		student.cheating();
	}

}
