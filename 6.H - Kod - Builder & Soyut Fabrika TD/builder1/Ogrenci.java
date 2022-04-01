package builder1;

public class Ogrenci implements Cloneable{
	private String ad;
	private String no;
	private String bolum;
	private String adres;
	private String sinif;
	private String danisman;
	private String tckimlik;
	
	public Ogrenci(String ad, String no, String bolum, String adres, String sinif, String danisman, String tckimlik) {
		this.ad = ad;
		this.no = no;
		this.bolum = bolum;
		this.adres = adres;
		this.sinif = sinif;
		this.danisman = danisman;
		this.tckimlik = tckimlik;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Ogrenci() {}
	
	public Ogrenci(String ad, String no) {
		this.ad = ad;
		this.no = no;
	}
	
	public Ogrenci(String ad, String no, String bolum) {
		this.ad = ad;
		this.no = no;
		this.bolum = bolum;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

	public String getDanisman() {
		return danisman;
	}

	public void setDanisman(String danisman) {
		this.danisman = danisman;
	}

	public String getTckimlik() {
		return tckimlik;
	}

	public void setTckimlik(String tckimlik) {
		this.tckimlik = tckimlik;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", no=" + no + ", bolum=" + bolum + ", adres=" + adres + ", sinif=" + sinif
				+ ", danisman=" + danisman + ", tckimlik=" + tckimlik + "]";
	}
	
	
	
}
