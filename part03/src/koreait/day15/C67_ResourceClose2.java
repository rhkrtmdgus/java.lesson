package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class C67_ResourceClose2 implements AutoCloseable {

	public static void main(String[] args) {
		
		String filename = "D:\\kje_java\\workspace\\part03\\src\\koriaitfile.txt";
		//io는 입력 출력
		
		//Scanner : 입력 기능을 갖는 클래스
		//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try~ catch 필요하다
		File file = new File(filename);
		
		try(Scanner sc = new Scanner(file)){
			
			
			while(sc.hasNext()) {
				System.out.println("파일에서 읽은 내용 :" + sc.nextLine());
			}
		
			System.out.println("파일 읽기 완료");
		}catch(FileNotFoundException e){
			
//			e.printStackTrace();
			System.out.println("사용자 오류 발생 : " + e.getMessage());
			System.out.println("지정된 파일이 없습니다.");
			
		}

		
		
		
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
