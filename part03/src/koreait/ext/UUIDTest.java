package koreait.ext;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		
		String uuid;
		//16���� 32�ڸ� + ������ ��ȣ 4���� ��������� ���� ���ڿ�
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid);
		}
		
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0,12));
		}
		
	}

}
