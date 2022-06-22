package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {
		
		String filename = "D:\\kje_java\\workspace\\part03\\src\\koriaitfile.txt";
		//io는 입력 출력
		
		File file = new File(filename);
		PrintWriter pw = null;
		try {
			
			//출력 기능을 갖는 클래스
			//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try~ catch 필요하다
			pw = new PrintWriter(file); // file 로 지정된 위치에 출력을 위한 객체

			pw.print("모모 90 89 82\n");
			pw.print("weaklfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("wea5464654654klfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("다현 90 89 82\n");
			pw.print("나연 90 89 82\n");
			System.out.println("파일이 출력이 완료되었습니다.");  // System.out : 표준 출력 (콘솔 출력)
			
		} catch (FileNotFoundException e) {
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
			System.out.println("오류 발생 : " + e.getMessage());
		}finally {
			pw.close();
		}
		

		
		
		
		
	}

}
