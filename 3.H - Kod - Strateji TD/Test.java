public class Test{
	public static void main(String[] args){
		Orderk ord = new PlastikOrdek();
		ord.ciz();
		ord.ot();
		
		ord.setOtebilme(new Vakvak());
		ord.ot();

		YesilOrdek ord2 = new YesilOrdek();

		ord2.ciz();
		ord2.ot();
		ord2.uc();
		ord2.setUcabilme(new Ucamama());
		ord2.setOtebilme(new Suskun());
		ord2.ot();
		ord2.uc();
	}

}