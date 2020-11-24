package pack;

public class TelevisionOffCommand implements Command{
	
	private Television television;

	public TelevisionOffCommand(Television television) {
		super();
		this.television = television;
	}


	@Override
	public void execute() {
		television.off();		
	}

}
