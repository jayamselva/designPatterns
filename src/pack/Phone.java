package pack;

public class Phone 
{
	private String OS;
	private int RAM;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String oS, int rAM, String processor, double screenSize, int battery) {
		super();
		OS = oS;
		RAM = rAM;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", RAM=" + RAM + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	
	

}
