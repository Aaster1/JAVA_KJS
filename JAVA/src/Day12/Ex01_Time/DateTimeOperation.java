package Day12.Ex01_Time;

import java.time.LocalDateTime;

public class DateTimeOperation {

	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재 시각 : "+now);
		
		
//		날짜, 시간 추가하기
//		+1년 +1개월 +1일 +3일시간 -15분 - 25초
		
//		LocalDateTime targetTime = now.plusYears(1);			//<--보면 해당 타입은 return 값으로 플러스된 값(객체)을 반환하는 형태이다.
//		targetTime.plusMonths(1); //<--그러니 이 형태는 의미가 없다. 아래와 같이 새로 갱신해줘야한다.
//		targetTime = targetTime.plusMonths(1); 	//<--그런데 이것도 생각해보면 비효율적이다. return 형태가 해당 자료형인데 왜 줄마다 하는가?
		
//		그래서 나온게 메소드 체인!
		LocalDateTime targetTime = now.plusYears(1)
										.plusMonths(1)
										.plusDays(1)
										.plusHours(-3)
										.plusMinutes(-15)
										.plusSeconds(-25);			//<--보면 해당 타입은 return 값으로 플러스된 값(객체)을 반환하는 형태이다.
										//(메소드체이닝), 빌더 패턴 필요
		
		System.out.println("변격된 시각 : "+targetTime);
		
	}
	
	
}
