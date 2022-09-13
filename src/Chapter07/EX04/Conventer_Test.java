package Chapter07.EX04;

import java.util.Scanner;

class Converter {		//환율을 계산하는 클래스
	//1. 필드
	double rate;		//환율을 저장하는 변수 : 1$ = 1377.30
	
	//2. 메소드 생성 (달러를 인풋받아서 원화를 반환하는 메소드), 메소드 이름 : toKWR()
	double toKWR(double dollor) {
		return dollor * rate;
	}
	
	//3. 메소드 생성 (원화를 인풋받아서 달러로 반환하는 메소드), 메소드 이름 : toDoller()
	double toDollor (double won) {
		return won/rate;
	}
	//4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당.
	void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
	
	
}

public class Conventer_Test {

	public static void main(String[] args) {
		// 네이버를 검색해서 오늘 환율을 알아와서
		
		// 객체 생성후 스캐너로 환율을 인풋 받아서 setRate() 메소드에 저장수
		//	원화 100만원 ==> 며 $ 인지 출력
		//	달러 $100	 ===> 몇 만원인지 출력 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1달러에 대한 오늘 환율을 입력하세요>>>");
		double rate = sc.nextDouble();
		
		//객체 생성
		Converter conventer = new Converter();	//기본 생성자 호출 (생략됨)
		
		//스캐너로 받은 rate 변수의 값을 setter 주입
		conventer.setRate(rate);
		
		// 100만원 ==> 몇 $
		
		System.out.println("원화 100만원" + conventer.toDollor(1000000) + "$입니다");
		
		// 100$ ==> 몇 만원
		
		System.out.println("100$는 " + conventer.toKWR(1000000) + "만원 입니다.");
	}

}
