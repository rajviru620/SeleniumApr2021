package week3.assignment;

public class College extends University{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.pg();
		c.ug("Mechanical");
		
	}

	@Override
	public String ug(String course) {
		// TODO Auto-generated method stub
		System.out.println("the course is : "+course);
		return course;
	}

}
