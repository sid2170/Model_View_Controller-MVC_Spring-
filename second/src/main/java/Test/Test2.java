package Test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Customer;
import business.Student;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");
		//this is a container, Application context create object of resources/spring.xml
		//bean (class) is converted into an objects
		
		Student s=(Student)ap.getBean("t");
		Customer c=(Customer) ap.getBean("c");
		
		System.out.println(c.getId()+", "+c.getName());
		
		System.out.println(s.getName()+", "+s.getEmail()+", "+s.getAge());
		
	}

}
