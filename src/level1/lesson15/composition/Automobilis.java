package level1.lesson15.composition;

public class Automobilis extends TransportoPriemone {

	private Vairas vairas;

	public Automobilis(int r) {
		vairas = new Vairas(r);
	}
	
	public Vairas getVairas() {
		return vairas;
	}

	public void setVairas(Vairas vairas) {
		this.vairas = vairas;
	}
	
	@Override
	public void metodasX() {
		System.out.println("77777777777");
	}
	
	
}