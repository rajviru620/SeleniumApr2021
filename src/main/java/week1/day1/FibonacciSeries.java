package week1.day1;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	public int fib(int range) 
	{
		int firstNum=0;
		System.out.println(firstNum);
		int secNum=1;
		System.out.println(secNum);
		for (int i = 1; i < range; i++)
		{
		int sum =firstNum+secNum;
		System.out.println(sum);
		firstNum=secNum;
		secNum = sum;
		}
		return range;
				
	}

	public static void main(String[] args) {
		int range =8;
		FibonacciSeries result = new FibonacciSeries();
		result.fib(range);
		

		}

}
