package day40_accesmodifiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		
		
		Car c = new Car();
		c.model = "M3";
		c.year = 2020;
		//c.door = 4; private oldugu icin yazilmaz sadece ayni sinifta olur
		c.engine = 5.3;
		
		System.out.println(c.toString());
		
		
		
		
		
		
		
		
		
	}
	
}
