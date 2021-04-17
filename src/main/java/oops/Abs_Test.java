package oops;

public class Abs_Test extends Abs_Shape{
	Abs_Test() {
		System.out.println("Test Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abs_Shape a = new Abs_Test();
		Abs_Test a = new Abs_Test();
		a.drawing();
		a.fill();
		a.color=5;
	}

	@Override
	void drawing() {
		// TODO Auto-generated method stub
		
	}

}
