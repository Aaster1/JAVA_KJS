package Day12.Ex01_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompare {
	
	 public static void main(String[] args) {
		
	
	
//		2023년 8월 9일 11시 0분 0초
		 LocalDateTime todayDateTime = LocalDateTime.of(2023,8,9,11,0,0);
		 System.out.println("오늘 : "+todayDateTime);
		 
//		2024년 1월 24일 18시 20분 0초
		 LocalDateTime endDateTime = LocalDateTime.of(2024,1,24,18,20,0);
		 System.out.println("종강일 : "+endDateTime);
		 
//		 A.isBefore(B);				//	A가 B보다 이전이면, true. 아니면 false
//		 A.isEqual(B);				//	A와 B가 같으면, true. 아니면 false
//		 A.isAfter(B);				//	A가 B보다 이후이면, true. 아니면 false
		 
		 if(todayDateTime.isBefore(endDateTime)) {
			 System.out.println("교육과정 진행중...");
		 }else if(todayDateTime.isAfter(endDateTime)) {
			 System.out.println("교육과정 종료(종강)");
		 }else {
			 System.out.println("훈련과정 종료");
		 }
	
//		until()
////		:	LocalDateTime 객체의 날짜/시간부터 ~ 인자로 지정한 객체의 날짜시간까지 남은 시간을 반환하는 메소드
		
		 
//		 ChronoUnit : 시간 간격을 측정하고 표현하는데 사용하도록 정리해둔 열거형 상수.
		 
		 long remainYear = todayDateTime.until(endDateTime, ChronoUnit.YEARS);
		 long remainMonth= todayDateTime.until(endDateTime, ChronoUnit.MONTHS);
		 long remainDay= todayDateTime.until(endDateTime, ChronoUnit.DAYS);
		 long remainHour= todayDateTime.until(endDateTime, ChronoUnit.HOURS);
		 long remainMinute= todayDateTime.until(endDateTime, ChronoUnit.MINUTES);
		 long remainSecond= todayDateTime.until(endDateTime, ChronoUnit.SECONDS);
		 
		 System.out.println("남은 연도 : "+remainYear);
		 System.out.println("남은 개월 : "+remainMonth);
		 System.out.println("남은 일수 : "+remainDay);
		 System.out.println("남은 시 : "+remainHour);
		 System.out.println("남은 분 : "+remainMinute);
		 System.out.println("남은 초 : "+remainSecond);
		 
		 
		 long YearsBetween = ChronoUnit.YEARS.between(todayDateTime, endDateTime);
		 long monthsBetween = ChronoUnit.MONTHS.between(todayDateTime, endDateTime);
		 long daysBetween = ChronoUnit.DAYS.between(todayDateTime, endDateTime);
		 long hoursBetween = ChronoUnit.HOURS.between(todayDateTime, endDateTime);
		 long minutesBetween = ChronoUnit.MINUTES.between(todayDateTime, endDateTime);
		 long secondsBetween = ChronoUnit.SECONDS.between(todayDateTime, endDateTime);
		 
		 
		 
		 
		 
	 }
}
