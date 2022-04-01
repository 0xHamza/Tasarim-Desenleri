public class YesilOrdek extends Ordek{
	
	public YesilOrdek(){
		otebilme = new VakVak();
		ucabilme = new KanatlaUc();
	}

	public double puanla(){
		return 10.0;
	}

	public void ciz(){
		System.out.println("Yeþil Ördek");
	}
}