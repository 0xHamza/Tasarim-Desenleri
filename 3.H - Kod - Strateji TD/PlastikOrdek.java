public class PlastikOrdek extends Ordek{
	
	public YesilOrdek(){
		otebilme = new VikVik();
		ucabilme = new Ucamama();
	}

	public double puanla(){
		return -10.0;
	}

	public void ciz(){
		System.out.println("Plastik Ördek");
	}
}