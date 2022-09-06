package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목의 구성원 수의 합과평균
		
		System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요>>>");
		String s ;
		String [] a;
		
		
		do {
			s = sc.nextLine();
			a = s.split(" ");
			if (s.equals("그만")) {
				
				
				break;
			}
				int b ;		//과목의 점수를 담는 변수
				int sum = 0 ;	//합을 구하는 변수
				int count = 0;
				for (int i = 0 ; i < a.length; i++) {
					if(i %2 !=0) { //홀수 방의 값만 가져온다. 
						b = Integer.parseInt(a[i]);	//홀수방의 값만 b변수에 저장
						sum += b;
						count++;
					}
			}
			System.out.println("구성원의 합 : " + sum);
			System.out.println("구성원의 평균: " + sum / (double)count);
			
		}while (true);
		System.out.println("프로그램을 종료합니다. ");

	
		
	}
}

