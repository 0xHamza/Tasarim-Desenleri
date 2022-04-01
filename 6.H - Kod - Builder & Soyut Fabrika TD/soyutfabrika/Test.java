package soyutfabrika;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PideDukkani dukkan = new KaradenizPideDukkani();
		Pide pide = dukkan.pideGetir("KIYMALI");
		
		System.out.println(pide);
	}

}
