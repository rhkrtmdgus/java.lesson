package koreait.ext;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

import com.google.common.hash.Hashing;





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
		
		
		/*
		 * google guava ���̺귯������ �����ϴ� sha256 �ؽ� �Լ� ���
		 */
		
		String password;
		
		String sha256 = Hashing.sha256().hashString("test#12", StandardCharsets.UTF_8)
				.toString();  // ������ ����� ���̶�� �����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ �Է��ϼ���. >>>> ");
		String you = sc.nextLine();
		password = Hashing.sha256().hashString(you, StandardCharsets.UTF_8)
				.toString();
		
		if(sha256.equals(password))
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		else
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		
	}

}
