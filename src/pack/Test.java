package pack;

public class Test {

	public static void main(String[] args) {
		
		
		OperatingSystemFactory osf= new OperatingSystemFactory();
		OS os= osf.getInstance("sdsd");
		os.spec();
	}

}
