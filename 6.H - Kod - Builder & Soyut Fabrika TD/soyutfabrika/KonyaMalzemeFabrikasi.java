package soyutfabrika;

public class KonyaMalzemeFabrikasi extends MalzemeFabrikasi{

	@Override
	public Kiyma getKiyma() {
		// TODO Auto-generated method stub
		return new KuzuKiyma();
	}

	@Override
	public Peynir getPeynir() {
		// TODO Auto-generated method stub
		return new BeyazPeynir();
	}

}
