package artikli;

import java.util.Iterator;
import java.util.LinkedList;

import greske.GTeret;

public class Kamion implements Merljiv {
	private double sopTezina, nosivost;
	private double teret;
	
	private LinkedList<Paket> listaPaketa = new LinkedList<Paket>();
	
	public Kamion(double sopTezina, double nosivost) {
		this.sopTezina = sopTezina;
		this.nosivost = nosivost;
	}
	
	public Kamion dodaj(Paket p) throws GTeret {
		if(teret + p.tezina() > nosivost) throw new GTeret();
		listaPaketa.add(p);
		teret += p.tezina();
		return this;
	}
	
	@Override
	public double tezina() {
		return sopTezina + teret;
	}
	

	public double vrednost() {
		double v = 0;
		Iterator<Paket> i = listaPaketa.iterator();
		while(i.hasNext()) {
			v += i.next().vrednost();
		}
		return v;
	}
	
	@Override
	public String toString() {
		String s = "Kamion(" + nosivost + "," + sopTezina + "," + tezina() + "," + vrednost() + ")";
		Iterator<Paket> i = listaPaketa.iterator();
		while(i.hasNext()) {
			s += "\n" + i.next();
		}
		return s;
	}
}
