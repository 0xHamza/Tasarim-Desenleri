package soyutfabrika;

public abstract class PideDukkani {
	protected MalzemeFabrikasi mfab;
	
	public PideDukkani(MalzemeFabrikasi f) {
		mfab = f;
	}
	
	public Pide pideGetir(String tip) {
		Kiyma k = mfab.getKiyma();
		Peynir p = mfab.getPeynir();
		Pide pide = null;
		if(tip.equals("KIYMALI"))
		   pide = new Pide(k, null);
		if(tip.equals("PEYNÝRLÝ"))
			   pide = new Pide(null, p);
			
		return pide;
	}
}
