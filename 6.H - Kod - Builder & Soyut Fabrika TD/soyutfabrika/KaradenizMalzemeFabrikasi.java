package soyutfabrika;

public class KaradenizMalzemeFabrikasi extends MalzemeFabrikasi{

	@Override
	public Kiyma getKiyma() {
		// TODO Auto-generated method stub
		return new DanaKiyma();
	}

	@Override
	public Peynir getPeynir() {
		// TODO Auto-generated method stub
		return new Cokelek();
	}

}
