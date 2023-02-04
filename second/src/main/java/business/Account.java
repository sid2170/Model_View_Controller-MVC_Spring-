package business;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private int accnum;
	private String acctype;
	private String accbranchname;
	
	//has a relationship
	
	Account(){
		super();
	}
	
	Account(int accnum, String acctype, String accbranchname){
		this.accbranchname=accbranchname;
		this.accnum=accnum;
		this.acctype=acctype;
	}

	/**
	 * @return the accnum
	 */
	public int getAccnum() {
		return accnum;
	}

	/**
	 * @param accnum the accnum to set
	 */
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}

	/**
	 * @return the acctype
	 */
	public String getAcctype() {
		return acctype;
	}

	/**
	 * @param acctype the acctype to set
	 */
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	/**
	 * @return the accbranchname
	 */
	public String getAccbranchname() {
		return accbranchname;
	}

	/**
	 * @param accbranchname the accbranchname to set
	 */
	public void setAccbranchname(String accbranchname) {
		this.accbranchname = accbranchname;
	}

}
