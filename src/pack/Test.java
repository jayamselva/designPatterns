package pack;

public class Test {

	public static void main(String[] args) {
		
		ScoreBoard scoreBoard= new ScoreBoard();
		
		Observer observer1 =  new ObserverImpl("Selvakumar");
		Observer observer2 =  new ObserverImpl("Murugu");
		Observer observer3 =  new ObserverImpl("Venki");
		Observer observer4 =  new ObserverImpl("Ram");
		
		scoreBoard.register(observer1);
		scoreBoard.register(observer2);
		scoreBoard.register(observer3);
		scoreBoard.register(observer4);
		
		
		observer1.subscribe(scoreBoard); //both way handshake.
		observer2.subscribe(scoreBoard); //both way handshake.
		observer3.subscribe(scoreBoard); //both way handshake.
		observer4.subscribe(scoreBoard); //both way handshake.
		
		
		observer1.update();  //No messages posted
		
		System.out.println();
		
		scoreBoard.postMessage("IPL score is 198/8");
		
		System.out.println();
		
		scoreBoard.unRegister(observer4);
		
		scoreBoard.postMessage("IPL score is 201/9");
		
		
		
		
	}

}
