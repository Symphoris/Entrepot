
public class Consomateur extends Thread{
	private String s;
	private Entrepot e;
	
	public Consomateur(String s, Entrepot e) {
		this.s = s;
		this.e = e;
	}
	
	public void run() {
		for(int i=0; i<=4;i++) {
			System.out.println("Avant conso"+e);
			e.prendre();
			System.out.println("Après conso"+e);
		}
	}
	
}
