package artikli;

public abstract class Roba implements Vrednostan, Merljiv, Cloneable {

	@Override
	public Roba clone() {
		try {
			return (Roba)super.clone();
		}catch(CloneNotSupportedException g) {return null;}
	}
}
