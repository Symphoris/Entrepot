import java.util.*;

public class Entrepot {
	private static final int NB_MAX = 3;
	private String s;
	private int nbObjet = 0;
	
	
	public Entrepot(String s) {
		this.s = s;
	}
	
	public int getObjet() {
		return this.nbObjet;
	}

	@Override
	public String toString() {
		return "Entrepot [s=" + s + ", objets=" + nbObjet + "]";
	}
	
	public boolean estVide() {
		return this.nbObjet == 0;
	}
	
	public boolean estPlein() {
		return this.nbObjet == NB_MAX;
	}
	
	public synchronized void mettre() {
		try {
			while(estPlein()) {
				System.out.println("Producteur endormi.");
				wait();// verrouille l'accè à producteur en le mettant en attente
			}
		} catch (InterruptedException e) {}
		this.nbObjet++;
		notifyAll();// fin d'attente dévérouille
	}
	
	public synchronized void prendre() {
		try {
			while(estVide()) {
				System.out.println("Consommateur endormi.");
				wait();// verrouille l'accè à consommateur
			}
		} catch (InterruptedException e) {}
		this.nbObjet--;
		notifyAll();
	}
	
	
	
	
}
