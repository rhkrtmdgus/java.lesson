package hrd.vo;

import java.sql.Date;

public class SaleVO {
	private int custno;
	private String custname;
	private String agade;
	private int asum;
	
	
	public SaleVO() {
		
	}
	
	public SaleVO(int custno, String custname, String agade, int asum) {
		this.custno = custno;
		this.custname = custname;
		this.agade = agade;
		this.asum = asum;
		
	}
	
	public int getCustno() {
		return custno;
	}
	
	public String getCustname() {
		return custname;
	}
	
	public String getAgade() {
		return agade;
	}
	
	public int getAsum() {
		return asum;
	}
	
	
	
	
	
}
