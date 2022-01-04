package com.example.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student bosch = context.getBean("bosch", Student.class);
		Student brooke = context.getBean("brooke", Student.class);
		bosch.displayInfo();
		brooke.displayInfo();
	}

}
