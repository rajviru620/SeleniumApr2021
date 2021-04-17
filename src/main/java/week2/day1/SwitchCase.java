package week2.day1;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 2;
		int num2 = 3;
		String method = "Test";
		switch (method) {
		case "Add":
			System.out.println(num1+num2);
			break;
		case "Sub":
			
			System.out.println(num1-num2);
			break;
		case "Mul":
			
			System.out.println(num1*num2);
			break;
		case "Div":
			
			System.out.println(num1/num2);
			break;
			
		default:
			System.out.println(num1%num2);
			
			break;
		}

	}

}
