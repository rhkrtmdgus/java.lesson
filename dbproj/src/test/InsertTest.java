package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertTest {

	public static void main(String[] args) {

		// db ���� �õ��� ���ϴ�. �����ϸ� Connection ��ü�� ��������ϴ�.
		
		Connection conn = OracleConnectionUtil.connect();
		
		System.out.println(conn);
		
		//Connection ��ü�� �̿��ؼ� SQL�� ������ �� �ֽ��ϴ�.
		//PreparedStatement ��ü�� SQL�� �������ؼ� �����մϴ�.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES (?, ?, ?, ?)"; // ���� sql ������ ; ���� �ʵ��� �Ѵ�.
		
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ID ( unique�� �� ) >>> ");
		String id = sc.nextLine();
		System.out.print("�� ���� >>> ");
		String name = sc.nextLine();
		System.out.print("�� �̸��� >>> ");
		String email = sc.nextLine();
		System.out.print("�� ���� >>> ");
		int age = Integer.parseInt(sc.nextLine());

		try {
			// 1��
			pstmt = conn.prepareStatement(sql);
			
			
			// 2�� SQL�� ���ε� �� �� ���� : ������ Ÿ�Կ� ���� setXXXXX() �޼ҵ� ����.
			pstmt.setString(1, id);
			pstmt.setNString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			
			// 3��
			pstmt.execute();  // insert, update, delete SQL �����մϴ�.
			
			System.out.println("------------------------"
					+ "\n���� ��ϵǾ����ϴ�.");
			System.out.print(String.format("-------------------------\n"
					+ "�� ID : %s\n�� ���� : %s\n�� �̸��� : %s\n�� ���� : %d\n",
					id, name, email, age));
			
		} catch (SQLException e) {
			System.out.println("SQL ���� ���� �Դϴ�. : " + e.getMessage());
			//e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}
	
	

}
