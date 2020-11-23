package pack;

public class OperatingSystemFactory 
{
	
	public OS getInstance(String str)
	{
		if(str.equalsIgnoreCase("Open"))
		{
			return new Androd();
		}else if(str.equalsIgnoreCase("close"))
		{
			return new Mac();
		}else {
			return new Windows();
		}
	}

}
