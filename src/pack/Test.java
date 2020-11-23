package pack;

public class Test {

	public static void main(String[] args) {
		
		
		//Phone p=new Phone("Android", 4, "Intel Pendium 4", 145.67d, 12);
		
		PhoneBuilder phoneBuilder= new PhoneBuilder();
		phoneBuilder.setOS("Android");
		phoneBuilder.setProcessor("Intel Pendium");		
		Phone phone = phoneBuilder.getPhone();
		
		//OR
		
		Phone p = new PhoneBuilder().setOS("Android").setProcessor("Intel Pendium").getPhone();
		
		System.out.println(phone);
		
	}

}
