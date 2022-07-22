package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class SelectWhereTest {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		
		String sql = "SELECT name, email FROM TBL_CUSTOM WHERE CUSTOM_ID = ? "; // ���� sql ������ ; ���� �ʵ��� �Ѵ�.
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȸ�� �� ID  >>> ");
		String id = sc.nextLine();

		try {
			// 1��
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			int i = 1; 
			//�߿� : where ���ǽ��� �÷� (CUSTOM_ID)�� �⺻Ű �̸� SELECT ��� 1�� �̰ų� ����
			while(rs.next()) {
				//rs�� ���� ���� ��� Ȯ��
				System.out.println(String.format("\n��ȸ�� ��� : %d ��° ��", i++));
				System.out.println("���� ���� �� �̸� : " + rs.getNString("NAME"));
				System.out.println("���� ���� �� �̸��� : " + rs.getNString("EMAIL"));
			}
			if (rs.next() == false) {
				System.out.println("��ȸ �� ����� �����ϴ�.");
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQL ���� ���� �Դϴ�. : " + e.getMessage());
			//e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
	}

}
