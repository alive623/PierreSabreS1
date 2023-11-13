package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public HistoireTP4() {

	}

	public static void main(String[] args) {
		Humain prof =new Humain ("prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		
		
		Commercant com = new Commercant("Marco", "undefined", 15);
		com.direBonjour();
		com.seFaireExtorquer();
		com.recevoirArgent(15);
		com.boire();
		
	}

}
