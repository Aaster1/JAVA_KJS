package Day12.Ex02_Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	
	public static void main(String[] args) throws ParseException{
		/*
			yyyy 	MM 		dd 		HH 		    hh			mm 		ss				<--1자리도 가능! 방법은 문자를 1개만
			4자연도 	2자월	2자일	2자시(12)	2자시(24)	2자분    2자초
			
			D			W			w			E			a		
			올해 기준 일	달 기준 주차	올해 기준 주차	요일			오전/오후
		*/	
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(now));
		
		String day = "2023/08/09";
		
		//w지정한 날짜 형식으로 문자열 날짜를 분석하여 Date 객체 생성
		Date date = new SimpleDateFormat("yyyy/MM/dd").parse(day);
		sdf = new SimpleDateFormat("yyyy/M/d");
		System.out.println(sdf.format(date));		//Date --> "2023/8/9"
		
		sdf = new SimpleDateFormat("yyyy년 MM월dd일");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy년 MM월dd일 a HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("올해 첫 날부터 D번째 날");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("이번 달 첫 날부터 d번째 날");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("올해의 w주차 입니다.");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("이번 달의 W주차 입니다.");
		System.out.println(sdf.format(date));
		
	}
}
