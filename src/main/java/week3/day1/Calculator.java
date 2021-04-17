package week3.day1;

public class Calculator {
	int x;
	double y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add(10, 5);
		c.add(10, 5, 2);
		c.sub(10, 5);
		c.sub(1000, 500);
		c.mutiply(10, 5);
		c.mutiply(10, 500);
		c.div(10, 2);
		c.div(1000, 5);

	}
	
	public int add(int a, int b) 
	{
		x= a+b;
		System.out.println("Value of Add1:"+x);
		return x;
	}
	
	public int add(int a, int b, int c) 
	{
		x= a+b+c;
		System.out.println("Value of Add2:"+x);
		return x;
	}
	
	public int mutiply(int a, int b) 
	{
		x= a*b;
		System.out.println("Value of Mul1:"+x);
		return x;
	}
	
	public double mutiply(int a, double b) 
	{
		y= a*b;
		System.out.println("Value of Mul2:"+x);
		return y;
	}
	
	public int sub(int a, int b) 
	{
		x= a-b;
		System.out.println("Value of Sub1:"+x);
		return x;
	}
	
	public double sub(double a, double b) 
	{
		y= a*b;
		System.out.println("Value of Sub2:"+y);
		return y;
	}
	
	public int div(int a, int b) 
	{
		x= a/b;
		System.out.println("Value of Div1:"+x);
		return x;
	}
	
	public double div(double a, int b) 
	{
		y= a/b;
		System.out.println("Value of Div2:"+y);
		return y;
	}
	
	
	
	
	

}