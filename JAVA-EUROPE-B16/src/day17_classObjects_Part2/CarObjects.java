package day17_classObjects_Part2;

public class CarObjects {

	public static void main(String[] args) {

		
		BMW b1 = new BMW();
		System.out.println(b1.make);
		
		//veya 
		
		BMW b2 = new BMW();
		System.out.println(b2.make);
		
		
		// veya 
		
		b1.make = "MehmetinArabasi";
		System.out.println(b1.make);
		
		// yeni bi deger olusturup sorma
		
		b1.model="m3";
		b1.showPrice();
		
		
		b2.model="X3";
		b2.showPrice();
		
	}

}
