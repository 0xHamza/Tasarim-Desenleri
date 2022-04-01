package fabrika;

public abstract class PideDukkani {
	
	
	public PideDukkani() {
	}
	
	public Pide pideGetir(String tip) {
		Pide p = pideUret(tip); // fabrika metotu �a��r�yoruz
		
		p.yagla();
		p.kes();
		p.paketle();
		return p;
	}
	
	public abstract Pide pideUret(String tip);
}
