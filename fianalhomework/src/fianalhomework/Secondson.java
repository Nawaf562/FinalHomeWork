package fianalhomework;

public class Secondson extends Father {

	public void name() {
		
		System.out.println("Hassan Ali");
		
	}
	
	public static void main(String[] args) {

		Father f = new Father();
		Firstson fs = new Firstson();
		Secondson ss = new Secondson();
		
		f.name(); 
		fs.name();
		ss.name();
	}

}
