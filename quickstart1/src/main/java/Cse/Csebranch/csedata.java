package Cse.Csebranch;

public class csedata {
	/*
	public void disp()
	{
		System.out.println("this is from cse data");
	}
	@Override
	public void mine() {
		//  Auto-generated method stub
		System.out.println("This my last output2");
		
	}
	*/

private int pin;
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
private String name;
private String branch;
@Override
public String toString() {
	return "csedata [pin=" + pin + ", name=" + name + ", branch=" + branch + ", getPin()=" + getPin() + ", getName()="
			+ getName() + ", getBranch()=" + getBranch() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public csedata(int pin, String name, String branch) {
	super();
	this.pin = pin;
	this.name = name;
	this.branch = branch;
}
public csedata() {
	super();
	// TODO Auto-generated constructor stub
}




}
