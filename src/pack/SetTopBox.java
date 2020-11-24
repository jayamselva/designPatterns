package pack;

public class SetTopBox 
{
	
	public void on()
	{
		System.out.println("SetTopBox is on...");
	}
	
	public void off()
	{
		System.out.println("SetTopBox is off...");
	}
	
	
	public void setChannel(int defaultChannel)
	{
		System.out.println("SetTopBox is set to Channel... "+defaultChannel);
	}
	
	public void setVolume(int volume)
	{
		System.out.println("SetTopBox is set to volume... "+volume);
	}

}
