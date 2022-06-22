package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception 처리명령이 별도 메소드에서 정의될 때 다른 방법: 1) 2)

public class C68_FileWriteTest {
	// main메소드가 throws Exception 한다면 jvm 에게 넘깁니다. 
	public static void main(String[] args) {
		
		String filename = "D:\\\\iclass95\\\\koriaitfile.txt";
		
		try {
			fileWrite2(filename);
//			filename = "D:\\\\iclass95\\\\koriaitfile.txt";
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("사용자 실행 오류 : " + e.getMessage());
			System.out.println("파일이 존재하는지 확인하세요.");
		}
		
		
		
	
	}
	//방법 1 Exception을 try~catch 로 직접 처리 
	public static void fileWrite(String filename) {
		File file = new File(filename);
		PrintWriter pw = null;
		try {
			
			pw = new PrintWriter(file); // file 로 지정된 위치에 출력을 위한 객체

			pw.print("모모 90 89 82\n");
			pw.print("weaklfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("wea5464654654klfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("다현 90 89 82\n");
			pw.print("나연 90 89 82\n");
			System.out.println("파일이 출력이 완료되었습니다.");  // System.out : 표준 출력 (콘솔 출력)
			
		} catch (FileNotFoundException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		}finally {
			pw.close();
			
		}
	}
	//방법 2 : throws 키워드는 해당 Exception을 호출하는 곳으로 넘긴다. ( 떠넘긴다 )
	// 참고 : throws 뒤에는 "," 로 구분해서 여러개로 지정 가능
	//			Exception 처리해야 할 메소드가 많이 정의되고 사용될 때 한곳에서 모두 처리할 수 있습니다.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = null;
		pw = new PrintWriter(file); // file 로 지정된 위치에 출력을 위한 객체	
			
		pw.print("모모 90 89 82\n");
		pw.print("다현 90 89 82\n");
		pw.print("나연 90 89 82\n");
		
		pw.close();
			
	}
	
	public static void fileRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		
		
		}
		sc.close();
	}

}
