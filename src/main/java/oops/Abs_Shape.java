package oops;

public abstract class Abs_Shape {
	Abs_Shape(){
		System.out.println("Shape constructor");
	}
	int color; // variables are abstract in nature
	abstract void drawing(); // abstract method
	
	// non abstract method
	public void fill() {
		System.out.println("Non abstract method - fill");
	}

}
