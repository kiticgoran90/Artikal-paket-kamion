package artikli;

import greske.GPunPaket;

public class Paket extends Roba implements Cloneable {
	private Roba[] niz;
	private int n;
	
	public Paket(int kap) {
		niz = new Roba[kap];
	}
	
	public Paket dodaj(Roba r) throws GPunPaket {
		if(n == niz.length) throw new GPunPaket();
		niz[n++] = r;
		return this;
	}

	@Override
	public double vrednost() {
		double v = 0;
		for(int i=0; i<n; i++) 
			v += niz[i].vrednost();
		return v;
	}
	
	@Override
	public double tezina() {
		double t = 0;
		for(int i=0; i<n; i++) 
			t += niz[i].tezina();
		return t;
	}
	
	@Override
	public Paket clone() {
		Paket p = (Paket)super.clone();
		p.niz = niz.clone();
		for(int i=0; i<n; i++)
			niz[i] = p.niz[i].clone();
		return p;
	}
	
	@Override
	public String toString() {
		String s = "[";
		for(int i=0; i<n; i++) {
			if(i>0) s += ",";
			s += niz[i];
		}
		return s + "]";
	}
}
