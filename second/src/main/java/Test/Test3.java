package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Student;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring1.xml");
		//this is a container, Application context create object of resources/spring.xml
		//bean (class) is responsible for creating  objects
		
		Student obj=(Student)ap.getBean("t");
		
		System.out.println(obj.getName()+" "+obj.getEmail()+" "+obj.getAge());
		
		

	}

}
