package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		{
		// for 문 내의 if
		// 정수 (음수, 양수) 을 스캐너로 5개 인풋 받아서
		// 양수만 더한 값 과 평균값을 출력 하세요.
		
		Scanner sc = new Scanner (System.in);
		int sum = 0 ;		//양수만 더함
		int sum1 = 0 ;		// 모든 수를 더함
		int count = 0 ;		// 양수를 카운트하는 변수
		int count1 = 0 ;	// 모든 수를 카으ㅜㄴ트함
		System.out.println(" 정수 5개를 입력하세요 (음수, 양수) >>");
		for ( int i = 0 ; i < 5 ; i++) {
			int n = sc.nextInt();
			sum1 += n;		//입력 받은 모든 수를 더함
			count1++;		//모든 수를 카운트
			if (n>0) {
				sum += n;
				count++;	//양수일때 1씩 증가
			}
			
			}
		System.out.println("양수의 합 :" + sum + ", 양수의 평균 : " + sum / (double)count);
		System.out.println("모든 수의 합 : " + sum1 + ", 모든 수의 평균 " + sum1/(double)count1);
		}

	}

}
