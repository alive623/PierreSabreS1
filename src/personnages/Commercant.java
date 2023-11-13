package personnages;
import personnages.Humain;

public class Commercant extends Humain {
	
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.setBoisson("the");
	}
	
	public int seFaireExtorquer() {
		int argentPerdu=getArgent();
		this.perdreArgent(getArgent());
		this.parler("J'ai tout perdu, le monde est trop injuste");
		return getArgent();
	}
	
	public void recevoirArgent(int i ) {
		this.gagnerArgent(i);
		this.parler(i + " sous ! Je te remercie, genereux donateur !");
	}
	

	public static void main(String[] args) {
		
		Commercant c1 = new Commercant("Marco", "undefined", 15);
		System.out.println(c1.getArgent());
		c1.seFaireExtorquer();
		System.out.println(c1.getArgent());
		c1.recevoirArgent(4445);
		System.out.println(c1.getArgent());

	}

}
