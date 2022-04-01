package singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Config conf1 = Config.getInstance();
		System.out.println(conf1);
		
		Config conf2 = Config.getInstance();
		System.out.println(conf2);
		
		conf1.setCoz_x(1024);
		
		System.out.println("----Sonra-----");
		
		System.out.println(conf1);

		System.out.println(conf2);
		
	}

}
