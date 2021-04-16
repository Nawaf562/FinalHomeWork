package fianalhomework;

public class Three extends Two {
	
public void One () {
		
		System.out.println("Method One from class Three");
	}

	public void Two () {
		
		System.out.println("Method Two from class Three");
	}

	public void Three() {
		
		System.out.println("class Three");
	}
	public static void main(String[] args) {
		
		One a = new One();  // object 1
		Two b = new Two();  //object 2
		Three c = new Three(); // object 3
		
		a.One(); // To print method One
		
		b.One(); //To print method One from class Two
		
		b.Two();//To print method Two
		
		c.One();//To print method One from class Three
		
		c.Two();//To print method Two from class Three
		
		c.Three();// To print method Three
	}

}
