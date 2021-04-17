package week2.day1;

public class ArmstrongAllNum {
	
	
	public static void main(String[] args) 
	{
		int calculated=0;
		int remainder;
		int original ;
		
		for(int num=1; num<1000; num++) 
		{
		
		while(num>0)
		{
		remainder = num%10;
		num =num/10;
		calculated =calculated + (remainder *remainder * remainder);
		}
		
		}
	}
}
