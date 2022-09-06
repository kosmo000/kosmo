package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*1 문제
		 	스캐너로 "Gold" 를 넣으면 "금메달 입니다" 를 출력
		 	스캐너로 "Silver" 를 넣으면 "은메달 입니다" 를 출력
		 	스캐너로 "Bronze" 를 넣으면 "동메달 입니다" 를 출력
		 	그외에는 "메달이 없습니다"
		 	
		 2. 문제
		 		스캐너로 월을 인풋받아서 해당월의 총 날짜를 
		 		"<월>은 <몇일> 일가지 있습니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메달 색은 무엇입니까?");
		String medal = sc.next();
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		
		System.out.println("몇월입니까?");
		int a = sc.nextInt();
		int prise = 0;
		
		switch ( a ) {
		case 1 : case 3 : case 5 : case 7: case 8: case 10: case 12:
			prise = 31;
			break;
		case 4: case 6 : case 9: case 11:
			prise = 30;
			break;
		default :
			prise = 28;
			break;
			
		}
		System.out.printf("%d월은 %d 일까지 있습니다.", a, prise);
		
		sc.close();
	}

}
