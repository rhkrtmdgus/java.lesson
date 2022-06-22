package koreait.test;


public class MainTest {

	public static void main(String[] args) {
		
		Bike bike = new Bike();
		System.out.println(bike.sell(20));
		
		Product[] cart = new Product[5];

		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Bike();
		cart[2] = new Bike();
		cart[3] = new Bike(99000, "ªÔ√µ∏Æ", 15);
		cart[4] = new Bike();
		
		System.out.println(cart[1]);
		
		
		for (int i = 0; i < cart.length; i++) {
		 
			if (cart[i].price >= 100000) { 
				cart.toString();
			}	
		}
		
		
		
		
		
	}

}
