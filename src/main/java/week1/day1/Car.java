package week1.day1;

//Access specifier keyword ClassName
public class Car {
	
	//Access specifier ReturnType methodName()
	public void driveCar() {
		System.out.println("drive Car");
				
	}
	
	public void applyBrake( ) {
		
		System.out.println("applied brake");
	}

public static void main(String[] args) {
	//ClassName objectName = new ClassName()
	
	Car myCar = new Car();
	myCar.driveCar();
	myCar.applyBrake();
}
	
}
