
public class TestEntrepot {

	public static void main(String[] args) {
		Entrepot e = new Entrepot("e1");
		Producteur p1 = new Producteur("p1", e);
		Consomateur c1 = new Consomateur("c1", e);
		
		p1.start();
		c1.start();
		
		try {
			p1.join(); c1.join();
		} catch (InterruptedException e1) {}
		
		System.out.println("Final"+e);
		
	}

}
