package pack;

public class ObserverImpl  implements Observer
{
	private String observerName;
	private Board board;	
	

	public ObserverImpl(String observerName) {
		super();
		this.observerName = observerName;
	}

	@Override
	public void update() {
		
		String msg = (String) board.getUpdate(this);
		
		if(msg == null)
		{
			System.out.println(observerName+"  no new message!!");
		}else {
			
			System.out.println(observerName+"  Consuming message "+msg);
		}
	}

	@Override
	public void subscribe(Board board) {
		
		this.board=board;
	}

}
