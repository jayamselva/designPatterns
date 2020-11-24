package pack;

public class SetTopBoxOffCommand implements Command{

	private SetTopBox setTopBox;	
	

	public SetTopBoxOffCommand(SetTopBox setTopBox) {
		super();
		this.setTopBox = setTopBox;
	}



	@Override
	public void execute() {
		
		setTopBox.off();
		
	}
}
