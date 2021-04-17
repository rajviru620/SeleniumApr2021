package week6.day1;

public class Employee {

	String empName;
	int empID;
	String compName;
	
	Employee(){
		System.out.println("First thing need to be executed");
		
	}
	Employee(int empID, String empName , String compName){
		this.empID = empID;
		this.empName = empName;
		this.compName = compName;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(100,"Hari","TestLeaf");
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.compName) ;

	}

}
