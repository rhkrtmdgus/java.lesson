package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class SelectTest2 {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		//select ���� ����� ��������� ����ü�� �����ϴ� �������̽� ���� Ÿ�� ����
		ResultSet rs = null;
		
		String sql = "SELECT * FROM TBL_CUSTOM";
		
		try {
			pstmt = conn.prepareStatement(sql);
			//select ���� ��� ���� ������ ���߽������� �� �� ����. �÷����� �˰� ����.
			rs = pstmt.executeQuery();
			
			//rs�� ���� ���� ��� Ȯ��
			System.out.println("��ȸ�� ����� �ֽ��ϱ�? (ù��° ��)" + rs.next());
			System.out.println("���� ���� �� ID : " + rs.getNString("CUSTOM_ID"));
			System.out.println("���� ���� �� �̸� : " + rs.getNString("NAME"));
			System.out.println("���� ���� �� �̸��� : " + rs.getNString("EMAIL"));
			System.out.println("���� ���� �� ���� : " + rs.getInt("AGE"));
			System.out.println("���� ���� �� ���Գ�¥ : " + rs.getTimestamp("REG_DATE"));
			
			System.out.println("\n��ȸ�� ����� �ֽ��ϱ�? (�ι�° ��)" + rs.next());
			System.out.println("���� ���� �� ID : " + rs.getNString(1));
			System.out.println("���� ���� �� �̸� : " + rs.getNString(2));
			System.out.println("���� ���� �� �̸��� : " + rs.getNString(3));
			System.out.println("���� ���� �� ���� : " + rs.getInt(4));
			System.out.println("���� ���� �� ���Գ�¥ : " + rs.getTimestamp(5));
			
		}catch(SQLException e) {
			System.out.println("SQL select ���� ���� : " + e.getMessage());
		
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}

}
