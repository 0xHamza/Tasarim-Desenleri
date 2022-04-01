package fabrika;

// Her bir nesne i�in ayr� bir metot ile fabrika td �rne�i
public class PideFabrikasiv2 {
	
	public Pide getKiymaliPide() {
		return new KiymaliPide();
	}
	
	public Pide getPeynirliPide() {
		return new PeynirliPide();
	}
}
