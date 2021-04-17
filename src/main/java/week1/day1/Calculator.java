package week1.day1;

public class Calculator {


	int sum;
	int sub;
	int multiple;
	int divide ;
	static int a = 20;
	static int b = 10;
	int c;
	double d;
	double e;
	int f;
	
//	 add() with 2 int arguments and return the sum
	public int add(int a, int b) {
	c= a +b;
	return c;
	}
	
//	 - sub() with 2 double arguments and return the subraction result
	
	public double subtract(double a, double b) {
		d= a -b;
		return d;
		}
		
//	- mul() with 2 double arguments and return the result
	
	public double multiply(double a, double b) {
		e= a*b;
		return e;
		}
//			    - divide() with 2 int arguments and return the result
	
	public int divide(int a, int b) {
		f= a /b;
		return f;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println(cal.add(a, b));
		System.out.println(cal.subtract(a, b));
		System.out.println(cal.multiply(a, b));
		System.out.println(cal.divide(a, b));
		
		
		
		
	}

}
