package Cse.Csebranch;

public class aimldata {
	private int pin;
	private String name;
	private String branch;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "aimldata [pin=" + pin + ", name=" + name + ", branch=" + branch + ", city=" + city + ", getPin()="
				+ getPin() + ", getName()=" + getName() + ", getBranch()=" + getBranch() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public aimldata(int pin, String name, String branch, String city) {
		super();
		this.pin = pin;
		this.name = name;
		this.branch = branch;
		this.city = city;
	}
	public aimldata() {
		super();
		// TODO Auto-generated constructor stub
	}

}
