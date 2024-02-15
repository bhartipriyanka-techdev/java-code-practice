package entity;

public class Customer {
	private int cId;
	private String cName;
	private String cPhno;
	private Address cAdd;
	private int noOfDaysToStay;
	public Customer(int cId, String cName, String cPhno, Address cAdd,int noOfDaysToStay) {
		this.cId = cId;
		this.cName = cName;
		this.cPhno = cPhno;
		this.cAdd = cAdd;
		this.noOfDaysToStay=noOfDaysToStay;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPhno() {
		return cPhno;
	}
	public void setcPhno(String cPhno) {
		this.cPhno = cPhno;
	}
	public Address getcAdd() {
		return cAdd;
	}
	public void setcAdd(Address cAdd) {
		this.cAdd = cAdd;
	}
	public int getNoOfDaysToStay() {
		return noOfDaysToStay;
	}
	public void setNoOfDaysToStay(int noOfDaysToStay) {
		this.noOfDaysToStay = noOfDaysToStay;
	}
	@Override
	public String toString() {
		return cId+"\t\t"+cName+"\t"+cPhno+"\t"+cAdd+"\t\t"+noOfDaysToStay;
	}
}
