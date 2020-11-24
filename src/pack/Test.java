package pack;

public class Test {

	public static void main(String[] args) {		
		
		RemoteControl remote = new RemoteControl(); //Here remote can be used to control TV and also Settopbox. Not tightly coupled.
												    //It is common to al devices. Not specific to any device.		
		
		SetTopBox setTopBox = new SetTopBox();
		remote.setCommand(new SetTopBoxOnCommand(setTopBox)); //Because here SetTopBoxOnCommand implements Command interface.
		remote.pressButton();
		
		remote.setCommand(new SetTopBoxOffCommand(setTopBox)); //Because here SetTopBoxOffCommand implements Command interface.
		remote.pressButton();
		
		System.out.println();
		
		Television tv=new Television();
		remote.setCommand(new TelevisionOnCommand(tv)); //Because here TelevisionOnCommand implements Command interface.
		remote.pressButton();
		
		
		remote.setCommand(new TelevisionOffCommand(tv)); //Because here TelevisionOffCommand implements Command interface.
		remote.pressButton();
		
		
	}

}
