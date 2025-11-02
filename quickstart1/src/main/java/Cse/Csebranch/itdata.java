package Cse.Csebranch;

public class itdata  {
	/*public void rocks(){
		System.out.println("this is from itdata");
	}
	@Override
	public void mine() {
		// TODO Auto-generated method stub
		System.out.println("This my last output from It");
		
	}
	*/
	private int pin;
	private String name;
	private String Branch;
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
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getCity() {
		return city;
	}
	public itdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "itdata [pin=" + pin + ", name=" + name + ", Branch=" + Branch + ", city=" + city + ", getPin()="
				+ getPin() + ", getName()=" + getName() + ", getBranch()=" + getBranch() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public itdata(int pin, String name, String branch, String city) {
		super();
		this.pin = pin;
		this.name = name;
		Branch = branch;
		this.city = city;
	}


}
