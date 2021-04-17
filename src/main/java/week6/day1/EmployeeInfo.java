package week6.day1;

public class EmployeeInfo {

	String empName;
	int empID;
	static String compName;
	
	EmployeeInfo(){
		System.out.println("First thing need to be executed");
		
	}
	EmployeeInfo(int empID, String empName , String compName){
		this.empID = empID;
		this.empName = empName;
		this.compName = compName;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo emp1 = new EmployeeInfo(100,"Hari","TestLeaf");
		EmployeeInfo emp2 = new EmployeeInfo(200,"Prasath","TestLeaf Software Solutions");
		System.out.println(emp1.empID+" "+emp1.empName+" "+emp1.compName);
		
		
		System.out.println(emp2.empID+" "+emp2.empName+" "+emp2.compName);

	}

}
