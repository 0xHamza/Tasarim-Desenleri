package soyutfabrika;

public class Pide {
	private Kiyma k;
	private Peynir p;
	
	public Kiyma getK() {
		return k;
	}
	public void setK(Kiyma k) {
		this.k = k;
	}
	public Peynir getP() {
		return p;
	}
	public void setP(Peynir p) {
		this.p = p;
	}
	
	public Pide(Kiyma k, Peynir p) {
		super();
		this.k = k;
		this.p = p;
	}
	@Override
	public String toString() {
		if(k == null)
			return p+ " Peynirli Pide";
		return k+ "lı Pide";
	}
	
	
	
	
}
