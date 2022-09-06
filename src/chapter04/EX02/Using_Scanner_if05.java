package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		 * 스캐너를 나이를 인풋받아서 출력 :
		  나이(age) 가 8세 미만이면 : "취학 전 아동입니다."
		  						 "입장료는 <1000>원 입니다."
		  나이가 14세 미만이면	:	"초등학생입니다."
		  						"입장료는 <2000>원 입니다."
		  나이가 20세 미만이면	:	"중, 고등학생입니다."
		  						"입장료는 <2500>원 입니다."
		  나이가 20세 이상이면	:	"일반인 입니다."
		  						"입장료는 <3000>원 입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("당신은 " + year + "살입니다.");
		double a = year;
		
		if ( a < 8) {
			System.out.println("취학 전 아동입니다. \n 입장료는 <1000>원입니다. ");	
		}else if (a < 14) {
			System.out.println("초등학생입니다. \n 입장료는 <2000>원입니다. ");
		} else if (a < 20) {
			System.out.println("중, 고등학생입니다. \n 입장료는 <2500원>입니다.");
		}
		else  {
			System.out.println("일반인입니다. \n 입장료는 <3000>원입니다. ");
	}
		sc.close();

	}
}
