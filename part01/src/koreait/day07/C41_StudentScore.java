package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {
		
		Student[] stus = new Student[5]; //배열 요소가 10개
		
		String[] names = {"이하니", "김모모", "박나연", "홍길동", "박지성"};
		
		stus[0] = new Student();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 3;
		
		for (int i = 1; i < names.length; i++) {
			
			stus[i] = new Student(); // 중요 
			stus[i].name = names[i];
			stus[i].no = i+1;
			stus[i].grade = 3;
			
		}
		
		for (int j = 0; j < names.length; j++) {
			System.out.println(stus[j]);
		}
		
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].name + " 점수를 입력하세요. ");
			Score temp = new Score();
			temp.input();
			stus[i].score = temp;
			System.out.println(stus[i]);
		}
		System.out.println("[[ 성적 통계 ]]");
		System.out.printf("%8s %10s %8s %8s\n", "번호", "이름", "총점", "평균");
		for (int i = 0; i < stus.length; i++) {
			System.out.printf("   %2d %8s    %3d   %5.1f\n", stus[i].no, stus[i].name, 
					stus[i].score.sum(), stus[i].score.average());
		}
		
	}
	

}
