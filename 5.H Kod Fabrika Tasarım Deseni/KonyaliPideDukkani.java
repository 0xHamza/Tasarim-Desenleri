package fabrika;

public class KonyaliPideDukkani extends PideDukkani {

	@Override
	public Pide pideUret(String tip) {
		Pide p = null;
		
		if(tip.equals("KIYMALI"))
			p = new KoKiymaliPide();
		if(tip.equals("PEYNIRLI"))
			p = new KoPeynirliPide();
		//yeni pide türleri için nesne üretme iþi
		return p;
		
	}
	
	
}
