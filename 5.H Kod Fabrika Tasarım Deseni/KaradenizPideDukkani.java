package fabrika;

public class KaradenizPideDukkani extends PideDukkani {

	@Override
	public Pide pideUret(String tip) {
		Pide p = null;
		
		if(tip.equals("KIYMALI"))
			p = new KaKiymaliPide();
		if(tip.equals("PEYNIRLI"))
			p = new KaPeynirliPide();
		//yeni pide t�rleri i�in nesne �retme i�i
		return p;
		
	}
	
	
}
