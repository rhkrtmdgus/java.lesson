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
		
		System.out.println("1���� " + result + " ms �Դϴ�. ");
		
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###,###,###");
		
		System.out.println("1���� " + df.format(result * 365L) + " ms �Դϴ�. ");
	
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
	
		//of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1999, 12, 11);
		System.out.println("�� ź���� Ȯ�� : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		//�� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ֽ��ϴ�. (���� �¾�� ���? ���? ����?)
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾�� " + between.getYears() + " ��(years)");
		System.out.println("     " + between.getMonths() + " ����(months)");
		System.out.println("     " + between.getDays() + " ��(days)");
		
		System.out.println("���� �¾�� : " + ChronoUnit.DAYS.between(mybirth, currentDate) + "�� �������ϴ�.");

		
	}

}
