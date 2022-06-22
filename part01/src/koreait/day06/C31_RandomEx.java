package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서를 만듭니다.
		 * 학생 인원은 100명 = 점수는 랜덤값으로 테스트 (0<= 난수 <= 100)
		 * 
		 * 90~100 : 0명 (소수점 1자리 %)
		 * 80~89 : 0명 (소수점 1자리 %)
		 * 70~79 : 0명 (소수점 1자리 %)
		 * 60~69 : 0명 (소수점 1자리 %)
		 * 60미만 : 0명 (소수점 1자리 %)
		 * 
		 * 
		 */
		
		int [] koreans = new int [300];
		int [] counts = new int [5];
		Random r = new Random();	
		
		for (int i = 0; i < koreans.length; i++) {
			koreans[i] = r.nextInt(101);
			if (koreans[i] >= 90)
				counts[0] += 1;
			else if (koreans[i] >= 80 && koreans[i] <= 89)
				counts[1] += 1;
			else if (koreans[i] >= 70 && koreans[i] <= 79)
				counts[2] += 1;
			else if (koreans[i] >= 60 && koreans[i] <= 69)
				counts[3] += 1;
			else counts[4] += 1;
	
		}
		
		int a = counts[0];
		int b = counts[1];
		int c = counts[2];
		int d = counts[3];
		int e = counts[4];
		
		
		
		System.out.printf("국어점수가 90~100 점인 학생 수 : %d (비율 %.1f %%)", a, (double)a/koreans.length*100);
		System.out.println();
		System.out.printf("국어점수가 90~100 점인 학생 수 : %d (비율 %.2f %%)", b, (double)b/koreans.length*100);
		System.out.println();
		System.out.printf("국어점수가 90~100 점인 학생 수 : %d (비율 %.2f %%)", c, (double)c/koreans.length*100);
		System.out.println();
		System.out.printf("국어점수가 90~100 점인 학생 수 : %d (비율 %.2f %%)", d, (double)d/koreans.length*100);
		System.out.println();
		System.out.printf("국어점수가 90~100 점인 학생 수 : %d (비율 %.2f %%)", e, (double)e/koreans.length*100);
		
		
		
		
			
	}

}
