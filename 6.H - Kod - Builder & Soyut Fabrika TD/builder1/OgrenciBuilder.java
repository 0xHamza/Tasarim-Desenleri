package builder1;

public class OgrenciBuilder {
	private Ogrenci o;
	
	public OgrenciBuilder ilkle() {
		o = new Ogrenci();
		return this;
	}
	
	public OgrenciBuilder setAdi(String s) {
		o.setAd(s);
		return this;
	}
	
	public OgrenciBuilder setNo(String s) {
		o.setNo(s);
		return this;
	}
	
	public OgrenciBuilder setBolum(String s) {
		o.setBolum(s);
		return this;
	}
	
	public OgrenciBuilder setDanisman(String s) {
		o.setDanisman(s);
		return this;
	}
	
	public OgrenciBuilder setTC(String s) {
		o.setTckimlik(s);
		return this;
	}
	
	public OgrenciBuilder setSinif(String s) {
		o.setSinif(s);
		return this;
	}
	
	public OgrenciBuilder setAdres(String s) {
		o.setAdres(s);
		return this;
	}
	
	public Ogrenci build() {
		Ogrenci son = o;
		o = new Ogrenci();
		return son;
	}
}
