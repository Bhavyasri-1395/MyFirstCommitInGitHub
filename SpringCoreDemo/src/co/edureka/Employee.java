package co.edureka;

//Bean or Model or POJO(Plain Old Java Project)
public class Employee {

	//Attributes
	int eid;
	String ename;
	//String eaddress;
	Address address;

	//Methods
	public Employee() {
		System.out.println("default constructor of Employee class");
	}

	//	public Employee(int eid, String ename, String eaddress) {
	//		this.eid = eid;
	//		this.ename = ename;
	//		this.eaddress = eaddress;
	//	}
	//
	//	public int getEid() {
	//		return eid;
	//	}
	//
	//	public void setEid(int eid) {
	//		this.eid = eid;
	//	}
	//
	//	public String getEname() {
	//		return ename;
	//	}
	//
	//	public void setEname(String ename) {
	//		this.ename = ename;
	//	}
	//
	//	public String getEaddress() {
	//		return eaddress;
	//	}
	//
	//	public void setEaddress(String eaddress) {
	//		this.eaddress = eaddress;
	//	}
	//
	//	@Override
	//	public String toString() {
	//		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	//	}

	public Employee(Address address) {
		System.out.println("parameterised constructor of Employee class");
		this.address = address;
	}

//	public int getEid() {
//		return eid;
//	}

	public void setEid(int eid) {
		this.eid = eid;
	}

//	public String getEname() {
//		return ename;
//	}

	public void setEname(String ename) {
		this.ename = ename;
	}

//	public Address getAddress() {
//		return address;
//	}

//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	public void myInit(){
		System.out.println("Object initialized");
	}

	public void myDestory(){
		System.out.println("Object destroyed");
	}
}
