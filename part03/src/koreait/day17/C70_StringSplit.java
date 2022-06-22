package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {
		//String 클래스의 split (분열시키다. 쪼개다 ) 메소드
		
		String temp = "모모 90 88 79";
		String result[] = temp.split(" ");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		//for 문으로
		for(int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		
		//향상된 for
		System.out.println("3. 향상된 for 출력");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		String temp2 = "모모, 90, 88, 79";
		result = temp2.split(", ");
		System.out.println("4. split 구분 기호 ,");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split 구분 기호 ,,");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		result = temp2.split(",,");
		System.out.println("6. split 구분 기호 ,,");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		//split 의 인자인 문자열은 정규식 문자열 입니다 ( ㅡ패턴은 복작)
		// 정규식
		
		temp2 = "모모,90 88()79";
		result = temp2.split("[,()]");  // [] 안에 들어가면 구분 기호가 or로 됨
		System.out.println("5. split 구분 기호 ,,");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,90,88,79";
		result = temp2.split(",", 3);  // limit 있을 시 인자 값에 따라 인자값 만큼 나눔
		System.out.println("8. split limit 확인");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		
		//배열과 유사한 자료구조 list
		//배열을 list로 변환하는 방법
		result = temp.split(",");
		List<String> rlist = Arrays.asList(result);
		
		// list 는 고정 리스트 이기 때문에 동적으로 해야함
		
		//동적 list로 바꾸기 인자를 다시 새로운 객체에 넣어 동적 리스트 만들기
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println(rlist);
		
		//Arrays.aslist는 테스트용으로 사용 또는 간단한 고정 리스트 사용할 떼
		
	}

}
