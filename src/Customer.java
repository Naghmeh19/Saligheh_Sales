
public class Customer {
	 int customerID;
	 String fisrtName;
	 double credit;
	 
	public Customer(int customerID, String fisrtName,double credit) {
		super();
		this.customerID = customerID;
		this.fisrtName = fisrtName;
		this.credit=credit;
	}
	
	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	 

}