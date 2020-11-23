package pack;

public class Test {

	public static void main(String[] args) {
		
		GelPen gelPen = new GelPen();
		PenAdater pen = new PenAdater(); //or Pen pen = new PenAdater();
		pen.setGelPen(gelPen);
		
		
		AssignmentWork aw= new AssignmentWork();
		aw.setPen(pen);
		aw.writeAssignment("I am tired of assignment work");
	}

}
