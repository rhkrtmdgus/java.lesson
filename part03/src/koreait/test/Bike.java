package koreait.test;

public class Bike extends Product {
	
	private int speed;
	
	
	public Bike() {
		
	}
	
	public Bike(int price, String prdName, int speed) {
		this.speed = speed;
		this.prdName = prdName;
		this.price = price;
		
	    
	}
	
	
	
	@Override
	public String sell(int price) {
		return String.format("�߰� ���� ��� - %d %% ����", price);
	}
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}
