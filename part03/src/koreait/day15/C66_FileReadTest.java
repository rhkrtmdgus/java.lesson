package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {
		
		String filename = "D:\\kje_java\\workspace\\part03\\src\\koriaitfile2.txt";
		//io는 입력 출력
		
		//Scanner : 입력 기능을 갖는 클래스
		//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try~ catch 필요하다
		File file = new File(filename);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); 
			
			while(sc.hasNext()) {
			System.out.println("파일에서 읽은 내용 :" + sc.nextLine());// 한줄만 입력됨
			}
			
		} catch (FileNotFoundException e) {
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
//			e.printStackTrace();   빨간 오류
			
 			System.out.println("사용자 오류 발생 : " + e.getMessage());
			
		}finally {
			if(sc != null)
				sc.close();
		}
		

		
		
		
		
	}

}
