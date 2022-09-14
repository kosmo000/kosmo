package Chapter07.EX05;
/*
class Car1 {
//this 키워드 : 필드나 메서드 선언시 사용 불가.
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
	
	Car1() {	//리턴 타입이 없다 , 클래스이름과 동일
		this.companyName = "현대자동차";	//this 키를 생략시 자동으로 컴파일러가 할당
		this.color = "검은색";
		this.maxSpeed = 200.0;
	}
	Car1(String companyname){	// 매개변수 이름 , 필드이름이 같을때
		this();		// this() 메소드 , 기본 생성자 호출
		this.companyName = companyname;
	}
	Car1(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	Car1(String companyName, String color, double maxSpeed){
		this(companyName,color);
		this.maxSpeed=maxSpeed;
	}
	// 필드의 모든 값을 출력 메소드 (print())
	void print () {
		System.out.println(companyName + "," + color + "," + maxSpeed);
	}
	

	
public class ThisMethod05 {

	public static void main(String[] args) {
		//this keyword, this Method 를 사용해서 처리
		
		//1. 매개 변수 0일때 

	}

}
*/