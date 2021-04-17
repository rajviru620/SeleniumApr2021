package week1.day1;

public class OddNumbers 
{

	public int oDD (int num) 
	{
		for(int i=0; i<num; i++)
		{
			if(i%2!=0) 
			{
				
				System.out.println(i);
					
			}	
		}
		return num;
		
	}
	
	
	static int num =20;
	public static void main(String[] args) 
	{
		System.out.println("Printing only the odd numbers from 1 to 20 are");
		
		OddNumbers result = new OddNumbers();
		result.oDD(num);
		
	}
		

}
