package pack;

public class Student {

	
	private static Student student = new Student();	
	
	private Student()
	{
		
	}
	
	public static Student getInstance()
	{
		return student;
	}
}
