package builder1;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Ogrenci o = new OgrenciBuilder().
									    ilkle().
									    setNo("23232").
									    setAdi("Ali").
									    setBolum("Bilmuh").
									    build();
		
		
		Ogrenci o2 = new OgrenciBuilder().
			    ilkle().
			    setAdi("veli").
			    setBolum("Bilmuh").
			    setDanisman("abc").
			    setNo("232").
			    setAdres("Ýstanbul").
			    build();
		
		Ogrenci o3 = (Ogrenci)o2.clone();

		System.out.println("Birinci : "+ o);
		
		System.out.println("Ýkinci: " + o2);
		
		System.out.println("Üçüncü: " + o3);
		
	}

}
