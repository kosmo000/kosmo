package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// switch 문으로 처리 ""
		// 스캐너 사용
		// 에스프레소, 카페라떼, 아보카도 주문할 경우 가격이 3,500원
		// 아메리카노 를 주문할 경우 : 2,500원
		// 그외에 메뉴를 출력할 경우 : 우리 매장에는 없는 메뉴입니다.
				
		// 출력 : 주문하신 <에스프레소>는 가격이 <3,500>원입니다.
		//		우리 매장에는 없는 메뉴 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문할 커피 메뉴를 고르세요>>>");
		String order = sc.next();
		int prise = 0;
		
		
		switch ( order ) {
		case "에스프레소" : case "카페라떼" : case "아보카도" : 
			prise = 3500;
			break;
		case "아메리카노":
			prise = 2500;
			break;
		default :
			System.out.println("우리 매장에는 없는 메뉴입니다.");
			break;
	}
		System.out.printf("주문하신 %s는 가격이 %d원입니다.", order, prise);
		
		sc.close();
	}
}
