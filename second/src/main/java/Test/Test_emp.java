package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Account;
import business.Address;
import business.Employee;

public class Test_emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring3.xml");
		Employee emp=(Employee) ap.getBean("empbean");
		
		System.out.println("Employee Details");
		System.out.println(emp.getEid()+", "+emp.getEname()+", "+emp.getEmail());
		
		System.out.println();
		
		System.out.println("Account details");
		Account ac= emp.getAcc();		
		System.out.println(ac.getAccnum()+", "+ac.getAcctype()+", "+ac.getAccbranchname());

		System.out.println();
		
		System.out.println("Address");
		Address ad= emp.getAddress();
		System.out.println(ad.getId()+", "+ad.getStreet()+", "+ad.getCity()+", "+ad.getState()+", "+ad.getCountry());
		
	}

}
