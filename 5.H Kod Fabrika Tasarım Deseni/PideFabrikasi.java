package fabrika;

public class PideFabrikasi {
	// Pide üretme iþinden sorumlu sýnýf
	public static Pide pideUret(String tip) {
		Pide p = null;
		
		if(tip.equals("KIYMALI"))
			p = new KiymaliPide();
		if(tip.equals("PEYNIRLI"))
			p = new PeynirliPide();
		//yeni pide türleri için nesne üretme iþi
		return p;
	}
}
