package pack;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Board{
	
	private List<Observer> observerList;
	private String message;
	private boolean changed;
	
	

	public ScoreBoard() {
		
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {		
		if(observer == null) {
			throw new NullPointerException("Observer cannot be null");
		}else if(!observerList.contains(observer)) {
			observerList.add(observer);
		}
		
	}

	@Override
	public void unRegister(Observer observer) {
		
		observerList.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		
		if(!changed)
		{
			return;
		}else {
			
			for(Observer obs:observerList)
			{
				obs.update();
			}
		}
		
	}

	@Override
	public Object getUpdate(Observer observer) {
		
		return this.message;
	}
	
	public void postMessage(String message)
	{
		System.out.println("Message posted-> :"+message);
		this.message=message;
		this.changed=true;
		notifyObserver();
	}

}
