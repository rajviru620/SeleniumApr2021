package oops;

public class Enc_Employee {
	private int empID;
	private String empName;
	private int empAge;
	//Encapsulation - data hiding (no one from outside can access these private variables- high security)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enc_Employee e = new Enc_Employee();
		e.setEmpAge(25);
		e.setEmpID(123);
		e.setEmpName("Raj");
		
		System.out.println("Emp Id is :- " +e.getEmpID());
		System.out.println("Emp Name is :- " +e.getEmpName());
		System.out.println("Emp Age is :- " +e.getEmpAge());
	}
	//generate getter and setter methods
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
