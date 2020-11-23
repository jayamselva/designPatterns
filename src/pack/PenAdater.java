package pack;

public class PenAdater implements Pen
{
	private GelPen gelPen; //or GelPen gelPen = new GelPen();
	

	public GelPen getGelPen() {
		return gelPen;
	}



	public void setGelPen(GelPen gelPen) {
		this.gelPen = gelPen;
	}



	@Override
	public void write(String str) {
		
		gelPen.mark(str);
		
	}

}
