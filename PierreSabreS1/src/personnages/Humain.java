package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void setArgent(int argent) {
		this.argent = argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	
	public void parler(String texte) {
    	System.out.println(prendreParole() + texte);

    }

    private String prendreParole() {
        return "(" + nom + ")- ";
    }
	
	public void direBonjour() {
		String MaChaine = "Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " +
	getBoisson();
		parler(MaChaine);
	}
	
	public void boire() {
		String MaChaine = "Mmmm, un bon verre de " + getBoisson() + "! GLOUPS !" ;
		parler(MaChaine);
	}
	
	
	public void acheter(String bien,int prix) {
		if (prix<=argent) {
			perdreArgent(prix);
			parler("J'ai "+ argent + " sous en poche, je vais pouvoir m'acheter  " + bien + " a " + prix +" sous " );
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + "a" + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
