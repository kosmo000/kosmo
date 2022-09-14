package chapter08.EX01;

// 접근 제어자 : 
//		클래스 이름앞에 : public, default (생략됨)
//		필드, 메소드 앞에 : public , protected, default(생략됨), private

//		* 클래스명, 필드명, 메소드명 반드시 접근 제어자가 할당되어 있음.

//	1. public : 같은 패키지의 모든 클래스에서 접근가능, 다른 패키지 에서도 접근 가능
//	2. protected : 같은 패키지의 모든 클래스에서 접근 가능,
//                 다른 패키지에서 상속 관계에 있을때만 가능
//	3. default(생략됨)	 : 같은 패키지 내에서 접근가능, 다른 패키지에서는 접근 불가능
//	4. private	 : 같은 파일에서만 접근 가능, 같은 패키지에서는 접근 불가능, 
					//다른 패키지에서도 접근 불가능

public class A {			//자신의 패키지, 다른 패키지에서 접근을 허용 (public)
	public int m = 3;
	public int n = 4;
	
	public void print() {
		System.out.println("A 클래스 접근");
	}
}
