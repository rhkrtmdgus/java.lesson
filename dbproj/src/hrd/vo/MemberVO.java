package hrd.vo;

import java.sql.Date;

public class MemberVO {
	
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private Date join_date;
	private String grade;
	private String city;
	
	public MemberVO() {
		
	}
	
	public MemberVO(int custno, String custname, String phone, String address, 
			Date join_date, String grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.join_date = join_date;
		this.grade = grade;
		this.city = city;
	}
	
	public int getCustno() {
		return custno;
	}
	
	public String getCustname() {
		return custname;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Date getJoin_date() {
		return join_date;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getCity() {
		return city;
	}
	
	
	
	
	
}
