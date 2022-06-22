package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class C67_ResourceClose1 implements AutoCloseable {

	public static void main(String[] args) {
		
		String filename = "D:\\iclass95\\koriaitfile.txt";
		//io는 입력 출력
		
		//Scanner : 입력 기능을 갖는 클래스
		//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try~ catch 필요하다
		File file = new File(filename);
		PrintWriter pw = null;
		
		try(PrintWriter pw1 = new PrintWriter(file)){
			pw1.write("모모 90 89 82\n");
			pw1.write("모모 90 89 82\n");
			pw1.write("모모 90 89 82\n");
			pw1.write("모모 90 89 82\n");
			pw1.write("모모 90 89 82\n");
			
			System.out.println("파일이 출력이 완료되었습니다.");
			
			pw1.close();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	
			
			
		
		
		
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
