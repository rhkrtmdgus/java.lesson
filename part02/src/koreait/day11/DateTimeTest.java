package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;



public class DateTimeTest {

	public static void main(String[] args) {
		
		
		int result = 24 * 60 * 60 * 1000;
		
		System.out.println("1일은 " + result + " ms 입니다. ");
		
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###,###,###");
		
		System.out.println("1년은 " + df.format(result * 365L) + " ms 입니다. ");
	
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
	
		//of() 메소드로 특정 시간 및 날짜 객체 생성
		LocalDate mybirth = LocalDate.of(1999, 12, 11);
		System.out.println("내 탄신일 확인 : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("내 탄생 시간 : " + mybirth_time);
		
		//새 버전 클래스는 날짜 사이의 간격 계산 클래스가 있습니다. (내가 태어난지 몇년? 몇달? 몇일?)
		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난지 " + between.getYears() + " 년(years)");
		System.out.println("     " + between.getMonths() + " 개월(months)");
		System.out.println("     " + between.getDays() + " 일(days)");
		
		System.out.println("내가 태어난지 : " + ChronoUnit.DAYS.between(mybirth, currentDate) + "일 지났습니다.");

		
	}

}
