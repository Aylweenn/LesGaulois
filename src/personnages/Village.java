package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	
	public Village(String nom, int nbVillageoisMaximum) { 
		this.nom = nom; 
		villageois = new Gaulois[nbVillageoisMaximum];	
		
		}
	public void ajouterHabitant(Gaulois gaulois) {
		if(nbVillageois > nbVillageoisMaximum ) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		assert(numeroVillageois < nbVillageoisMaximum);
		int i=0;
		Gaulois gaulois;
		while((i!=numeroVillageois) && (i<nbVillageoisMaximum)) {
			i++;
		}
		gaulois = villageois[i];
		return gaulois;
	}
	
	public void afficherVillageois(Village village, Chef chef) {
		System.out.println("Dans le village "+ village +" du chef "+chef+" vivent les légendaires gaulois :");
		for(int i=0; (village.villageois[i] != null) && (i<nbVillageoisMaximum) ; i++) {
			System.out.println("- "+village.villageois[i].getNom()+ "\n");
		}
	}
	
	public String getNom() { 
		return nom; 
		}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Gaulois gaulois = village.trouverHabitant(30);
//		Chef abraracourcix = new Chef("Abraracourcix",6,village);
//		Gaulois asterix = new Gaulois("Astérix",8);
//		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
// 		j'ai obtenu la réponse null
//		Gaulois obelix = new Gaulois("Obélix",25);
//		village.ajouterHabitant(obelix);
//		village.afficherVillageois(village, abraracourcix);
	}
}
