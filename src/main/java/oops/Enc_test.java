package oops;

public class Enc_test extends Enc_Employee{

	//External users cannot access the private variables(Adv of Encapsulation- High security)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enc_Employee t = new Enc_test();
		System.out.println(t.getEmpID());
		System.out.println(t.getEmpName());
		System.out.println(t.getEmpAge());
		
	}

}
