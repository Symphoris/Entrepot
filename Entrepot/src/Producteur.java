
public class Producteur extends Thread{
	private String s;
	private Entrepot e;
	
	public Producteur(String s, Entrepot e) {
		this.s = s;
		this.e = e;
	}
	
	public void run() {
		for(int i=0; i<=4;i++) {
			System.out.println("Avant prod"+e);
			e.mettre();
			System.out.println("Après prod"+e);
		}
	}
	
}
