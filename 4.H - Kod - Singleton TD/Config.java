package singleton;

public class Config {
	private int coz_x;
	private int coz_y;
	//private Yonler yonler;
	
	private static Config instance = new Config();
	
	private Config() {
		coz_x = 480;
		coz_y = 640;
		// alt alan ilklemeleri
	}
	
	public static Config getInstance() {
		return instance;
	}

	public int getCoz_x() {
		return coz_x;
	}

	public void setCoz_x(int coz_x) {
		this.coz_x = coz_x;
	}

	public int getCoz_y() {
		return coz_y;
	}

	public void setCoz_y(int coz_y) {
		this.coz_y = coz_y;
	}
	
	public String toString() {
		return "Çözünürlük-> x: "+coz_x + " y: "+ coz_y;
	}
	
	
}
