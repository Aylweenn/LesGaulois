package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert(force >= 0);
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert(force>0);
		int forceAvantCoup = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}

		assert(force <= forceAvantCoup);
	}
	
	public boolean forcePositive(){
		if(force>0){
			return true; 
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Romain romain2 = new Romain("Minus",6);
		romain2.parler("Bonjour");
		romain2.recevoirCoup(10);
	}
}
