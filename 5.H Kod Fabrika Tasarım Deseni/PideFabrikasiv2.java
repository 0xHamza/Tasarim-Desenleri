package fabrika;

// Her bir nesne için ayrı bir metot ile fabrika td örneği
public class PideFabrikasiv2 {
	
	public Pide getKiymaliPide() {
		return new KiymaliPide();
	}
	
	public Pide getPeynirliPide() {
		return new PeynirliPide();
	}
}
