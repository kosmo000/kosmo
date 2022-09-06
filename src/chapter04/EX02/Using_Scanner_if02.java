package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋 받아서 60점이상이면 합격, 미만이면 불합격
		//	4학년인 경우 70이상이면 합격,	중첩 if 문 사용 ( if 내에 if문)

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int year = sc.nextInt();
		
		System.out.println("당신의 점수는 " + score + "이고, 당신의 학년은 "+ year + "학년입니다.");
		
		double a = score;
		double b = year;
		
		if ( a >= 60 && b < 4) {
			System.out.println("합격입니다. ");	
		}else if (a >=70 && b >=4) {
			System.out.println("합격입니다.");
		} else if (a < 70 && b>=4) {
			System.out.println("불합격입니다.");
		}
		else  {
			System.out.println("불합격입니다. ");
	}
sc.close();
	}
}
