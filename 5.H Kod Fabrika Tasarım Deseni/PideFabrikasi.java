package fabrika;

public class PideFabrikasi {
	// Pide �retme i�inden sorumlu s�n�f
	public static Pide pideUret(String tip) {
		Pide p = null;
		
		if(tip.equals("KIYMALI"))
			p = new KiymaliPide();
		if(tip.equals("PEYNIRLI"))
			p = new PeynirliPide();
		//yeni pide t�rleri i�in nesne �retme i�i
		return p;
	}
}
