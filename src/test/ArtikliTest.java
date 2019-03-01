package test;

import artikli.Artikal;
import artikli.Kamion;
import artikli.Paket;

public class ArtikliTest {

	public static void main(String[] args) {
		
		try {
			Paket p = new Paket(5);
			p.dodaj(new Artikal("cigla", 100, 2))
			 .dodaj(new Paket(2)
					 .dodaj(new Artikal("solja", 200, 0.2))
					 .dodaj(new Artikal("tanjir", 5000, 0.4)))
			 .dodaj(new Artikal("cekic", 350, 0.6));
			
			Kamion k = new Kamion(800, 2500);
			k.dodaj(p)
			 .dodaj(p.clone())
			 .dodaj(p.clone())
			 .dodaj(p.clone());
			System.out.println(k);
		}catch(Exception g) {System.out.println(g);}
	}
}
