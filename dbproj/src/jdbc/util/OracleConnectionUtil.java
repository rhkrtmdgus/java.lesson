package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleConnectionUtil {
	
	public static Connection connect() {
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:XE";   //�����ͺ��̽� URL - �������� Ȯ�ΰ����մϴ�.
					//jdbc ��������, ����Ŭ ����, localhost�� ip�� ��ü
		String driver="oracle.jdbc.driver.OracleDriver";     //����Ŭ ����̹�Ŭ����(��Ű����.Ŭ������)
		String user ="c##idev";				//������ ���� ���� - �����̸�
		String password="1234";				//            �� �н�����
		
		try {
			//�޸𸮿� �����ͺ��̽� ����̹��� �ε��մϴ�.(�ε�-> ����)
			Class.forName(driver);
			
	//DriverManager Ŭ������ �޸𸮿� �ε�� ����̹� Ŭ������ �����ϰ�		
	//DriverManager Ŭ������ �޼ҵ� getConnection ���� �����ͺ��̽�(����Ŭ) ����̹��� ���� Connection ������ü�� ����
	//                                                    			��    �������̽� Connection Ÿ������ �����մϴ�.
			conn = DriverManager.getConnection(url,user,password);    //db ���ῡ �ʿ��� ���� ���ڷ� ����
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("�����ͺ��̽� ����̹� �ε忡 ������ ������ϴ�. : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� �� ��뿡 ������ ������ϴ�. : " + e.getMessage());
		} 
		
		return conn;   //������ Connection ��ü �����մϴ�.
	}
	
	//����Ŭ ���� Connection ��ü close �޼ҵ� - ���� Ÿ�� Connection
	public static void close(Connection conn, PreparedStatement pstmt) {
		if(conn != null)   //conn �� ���̾ƴҶ��� close �����ϵ��� �մϴ�.
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���ῡ ������ ������ϴ�. : " + e.getMessage());
			}
	}
}
// jdbc �ǽ� ����
//1. jdbc ���̺귯�� �߰�
//�� ������Ʈ ��Ŭ�� -> �޴��߿� Build Path
//  -> Configure build path...
//  -> Libraries �� -> Add External jar
//  -> ���� ojdbc11. jar ã�Ƽ� �߰�
//  �� ��Ű�� �ͽ��÷η����� Ȯ�� - referenced libraries


// 2. OracleConnectionUtil Ŭ���� �ۼ�

//�����ͺ��̽� ���� : Connection ���� ��ü�� �����ϰ� �������ִ� Ŭ���� �޼ҵ带 �ۼ�
//         ��1) jdbc ����̹��� �޸𸮿� �ε� ���Ѿ� �մϴ�.
//          �� Class.forName("��Ű����.Ŭ����")
//              �� ����Ŭ ����̹� Ŭ����
//          2) DriverManager.getConnection �޼ҵ� ����. ���� url, user, password db ���� ������ �̿��Ͽ�
/*			Connection ��ü ����
 * 3. DBConnectionTest Ŭ���� 
 *   - 2������ ���� OracleConnectionUtil Ŭ���� connect() �޼ҵ� �׽�Ʈ
 *   - ���� ���� Ȯ���� �Ǹ� SQL insert ���� �׽�Ʈ
 *   
 * 4. InsertTest Ŭ����
 *   - 3���� ������ insert SQL �׽�Ʈ
 *   - tbl_custom  ���̺� insert
 *   - PreparedStatement �� �̿��մϴ�. ���࿡ �ʿ��� �����͸� ���� ���ε��� �մϴ�. ? ��ȣ ���
 *   - PreparedStatement �������̽� �Դϴ�. PreparedStatement Ÿ�� ���� ������ PreparedStatement�� �߻� �޼ҵ带
 *     ������ ���� ��ü. conn.prepareStatement(sql)�� ����ϴ� ����Ŭ ����̹� Ŭ������ ���� sql�� ���椷�ϰ� ������ ��ü�� �����˴ϴ�.
 *     
 * 5. InsertBuyTest Ŭ����
 *   - tbl_buy ���̺� insert               -- ������� 07�� 05�� ��������
 *   
 *
 * 6. SelectTest
 * 
 * 1) select SQL�� pstmt.executeQuery() �޼ҵ� ����
 * 2)   ���� ��� ��ü�� ResultSet Ÿ������ ����
 * 3) rs.next() �޼ҵ�� ��ȸ��� ����� ������� �����մϴ� ���� ������ true, ������ false ����
 * 4) rs.get XXX ()�� Ư�� �÷� �� ��������
 *   
 * ���� : pstmt.setXXX()�� SQL ���࿡ �ʿ��� �� ���ε� (����)
 *   
 * 7. select ����� �ڹٿ��� �����ϱ� > list ���. List<E>, <E>�� ���׸� Ÿ��
 */

//1. check_member ���ν��� ����
//2. check_book ���ν��� ����
//3. 2������ ���� å ���� Ȯ���ϰ� �ذ��ϱ�
//4. ȸ��IDX �� �������� �Է¹޾Ƽ� ����


