package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) { 
		this.nom = nom; 
		villageois = new Gaulois[nbVillageoisMaximum];
		
		
		}
	public void ajouterHabitant(Gaulois gaulois) {
		
		
	}
	public String getNom() { 
		return nom; 
		}

}
