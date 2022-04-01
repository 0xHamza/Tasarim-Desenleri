public abstract class Ordek{
	protected Otebilme otebilme;
	protected Ucabilme ucabilme;
	
	public abstract double puanla();
	public abstract void ciz();

	public void setUcabilme(Ucabilme ucOzellik){
		ucabilme = uCOzellik;
	}

	public void setOtebilme(Otebilme otOzellik){
		otebilme = otOzellik;
	}

	public void uc(){
		ucabilme.uc();
	}

	public void ot(){
		otebilme.ot();
	}

}