package koreait.ext;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

import com.google.common.hash.Hashing;





public class UUIDTest {

	public static void main(String[] args) {
		
		String uuid;
		//16진수 32자리 + 하이픈 기호 4개로 만들어지는 랜덤 문자열
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
		 * google guava 라이브러리에서 제공하는 sha256 해싱 함수 사용
		 */
		
		String password;
		
		String sha256 = Hashing.sha256().hashString("test#12", StandardCharsets.UTF_8)
				.toString();  // 서버에 저장된 값이라고 생각하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("암호 입력하세요. >>>> ");
		String you = sc.nextLine();
		password = Hashing.sha256().hashString(you, StandardCharsets.UTF_8)
				.toString();
		
		if(sha256.equals(password))
			System.out.println("암호가 일치합니다.");
		else
			System.out.println("암호가 일치하지 않습니다.");
		
	}

}
