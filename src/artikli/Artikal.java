package artikli;

public class Artikal extends Roba {
	private String naziv;
	private double vrednost, tezina;
	
	public Artikal(String naziv, double vrednost, double tezina) {
		this.naziv = naziv;
		this.vrednost = vrednost;
		this.tezina = tezina;
	}
	
	@Override
	public double vrednost() {
		return vrednost;
	}
	
	@Override
	public double tezina() {
		return tezina;
	}
	
	@Override
	public String toString() {
		return "(" + naziv + "," + vrednost + "," + tezina + ")";
	}
}
