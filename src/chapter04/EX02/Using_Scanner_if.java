package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서  
		// Scanner로 국어(aa)점수, 영어(bb), 수학(cc), 과학(dd) ,음악(ee) 점수를 인풋 받습니다.
		// if 문을 사용해서 평균이 90점이상이면 "A 학점", 80점이상 "B 학점"
		// 70점이상 : "c 학점", 60이상 : "D 학점", 나머지 : "F학점"

		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		
		System.out.println("당신의 국어점수는 "+aa + " 이고 수학점수는 "+ bb + " 이고, "
						+ "당신의 수학점수는 " + cc + " 이고, " + "당신의 과학점수는 " + dd + " 이고, " + "당신의 음악 점수는 " +ee + "입니다. ");
		
		
		
		double avg = (aa + bb + cc + dd + ee)/5.0;
		
		if ( avg >= 90) {
			System.out.println("A 학점입니다. ");	
		}else if (avg >= 80) {
			System.out.println("B 학점입니다. ");	//실문 실행후 if문을 빠져나옴
		}else if (avg >= 70) {
			System.out.println("C 학점입니다. ");
		}else if (avg >= 60) {
			System.out.println("D 학점입니다. ");
		}else {
			System.out.println("학점 미달입니다.");
		}sc.close();

	}
	
}
