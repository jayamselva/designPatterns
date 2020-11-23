package pack;

public class Student {
	
	
	static Student student = new Student();
	
	private Student()
	{
		
	}

	public static Student getInstance()
	{
		return student;
	}
}
