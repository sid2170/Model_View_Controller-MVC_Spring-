package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Employee;

public class Test_autowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring4.xml");
		Employee empbean= (Employee) ap.getBean(Employee.class);
		empbean.setEid(101);
		empbean.setEmail("abc@gmail.com");
		empbean.setEname("Sid");
		System.out.println("Employee Details");
		System.out.println(empbean.getEid()+", "+empbean.getEname());
		
		System.out.println("Account Details");
		empbean.getAcc().setAccnum(10);
		empbean.getAcc().setAcctype("saving");
		empbean.getAcc().setAccbranchname("INDIA");
		
		System.out.println(empbean.getAcc().getAccnum()+", "+empbean.getAcc().getAcctype()+", "+
		empbean.getAcc().getAccbranchname());
		

	}

}
