package chapter04.EX05;

import java.util.Scanner;

public class Using_while02 {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		// 힌트 : string오로 인풋 값을 받아서 int 형으로 변경
		Scanner sc = new Scanner (System.in);
		int count = 0 ; 	//정수가 입력되는 갯수를 카은트함, <평균>
		int sum = 0;		//입력 받는 정수를 모두 더한 값
		
		System.out.println("원하는 정수를 입력하세요. 마지막에 그만으로 종료를 알리세요");
		String n = sc.next();		// 콘솔에서 정수값을 입력 받어 n 변수에 할당
		
		// 반복횟수를 알 수 없는 경우 : while
		while ( n != "그만") {	//입력 받은 정수 값이 -1이 아니면 while 문을 실행
			sum += Integer.valueOf(n) ;
			count++;		//정수 값을 count함
			n = sc.next();		// -1이 정수 값으로 input 이되면 투표를 빠져나온다.
		}
		if (count==0) { // 제일 처음에 정수인수를  -1
			System.out.println("입력된 정수가없습니다. ");
		
		} else {
			System.out.println("입력된 정수는 : " + count + " 개입니다.");
			System.out.println("입력된 정수의 합은 " + sum + " 입니다.");
			System.out.println("입력된 정수의 평균은 " + sum/(double)count + " 입니다.");
sc.close();
	}

}
}