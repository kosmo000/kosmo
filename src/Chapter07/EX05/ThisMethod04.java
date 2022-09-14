package Chapter07.EX05;

class Car {
	
	// this 키워드 : 필드나 메서드 선언시 사용 불가.
	// 				- 생성자, 메서드 내부에서 필드나 메서드를 사용할때 자신의 객체 필드나 메서드를 지칭
	//				- 자신의 객체와 필드, 메서드를 가르킨다. 기본적으로 생략해서 많이 사용.
	//				- 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	// this ()		- 생성자 내부에서만 사용 , 반드시 첫 라인에 위치
	//				- 자신의 객체와 다른 생성자를 호출
	//				- 생성을 오버라이팅 할 때 코드를 간략 하게 사용

	
	String companyName;	//현대자동차 - 초기값.
	String color;		//검은색
	double maxSpeed;	//200.0 km/h
	
	//생성자
	
	Car() {	//리턴 타입이 없다 , 클래스이름과 동일
		this.companyName = "현대자동차";	//this 키를 생략시 자동으로 컴파일러가 할당
		this.color = "검은색";
		this.maxSpeed = 200.0;
	}
	Car(String companyname){	// 매개변수 이름 , 필드이름이 같을때
		this();		// this() 메소드 , 기본 생성자 호출
		this.companyName = companyname;
	}
	Car(String companyname, String color){
		this(companyname);
		this.color = color;
	}
	Car (String companyname, String color, double maxSpeed){
		this(companyname,color);
		this.maxSpeed=maxSpeed;
	}
	
	
	void print ( ) {
		System.out.println("회사명 : "+companyName);
		System.out.println("색상 : "+color);
		System.out.printf("최고 속도 : %.2f km/h",maxSpeed);
		System.out.println();
	}
	
}

public class ThisMethod04 {

	public static void main(String[] args) {
		// Use thiskeyword, thisMethod
		
		//1. 기본값
		System.out.println("=== 기본값 ===");
		Car car1 = new Car();
		car1.print();
		
		//2. 회사명 알 때
		System.out.println("=== 회사명 앎 ===");
		Car car2 = new Car ("벤츠");
		car2.print();
		
		//3. 회사명 및 색상 알 때
		System.out.println("=== 정보 두 가지를 알 때 ===");
		Car car3 = new Car ("크라이슬러", "퓨어 화이트");
		car3.print();
		
		//4. 모든 정보를 알 때
		System.out.println("=== 모든 정보를 알 때 ===");
		Car car4 = new Car ("Jeep","버건디 레드",275.05);
		car4.print();

	}

}
