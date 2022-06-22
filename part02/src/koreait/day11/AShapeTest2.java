package koreait.day11;

public class AShapeTest2 {

	public static void main(String[] args) {
		
		Ashape sha = new Ashape() {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + height;
			}
		};
		
		Ashape sha2 = new Ashape(20, 13) {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + height;
			}
		};
		
		System.out.println("sha ≥–¿Ã = " + sha.getArea());
		System.out.println("sha2 ≥–¿Ã = " + sha2.getArea());
	
	}

}
