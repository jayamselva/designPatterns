package pack;

public class PhoneBuilder 
{
	
	private String OS;
	private int RAM;
	private String processor;
	private double screenSize;
	private int battery;
	
	
	public PhoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}
	public PhoneBuilder setRAM(int RAM) {
		this.RAM = RAM;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(OS, RAM, processor, screenSize, battery);
	}

}
