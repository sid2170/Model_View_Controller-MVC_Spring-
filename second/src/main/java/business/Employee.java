package business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int eid;
	private String ename;
	private String email;
	
	@Autowired  // is used for Automatically injecting secondary(class) type of dependency
	private Account acc; // has a relation with account class
	
	@Autowired
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	// we dont need to create constructor as we are using setter dependency injection which calls default constructor
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the acc
	 */
	public Account getAcc() {
		return acc;
	}
	/**
	 * @param acc the acc to set
	 */
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	

}
