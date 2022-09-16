package chapter10.EX07;

import chapter10.EX07.Animal;

class Animal {
	//자식 클래스에서 2개의 메소드를 오버 라이딩 
	// Animal 타입으로 정의, 배열에 저장후, 오버라이딩 된 메소드 출력 (for, Enhanced)
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다. ");
	}
}
class Tiger extends Animal{
	int count;		//호랑이 수
	//생성자 : 정수를 인풋 받아서 count 필드의 값에 할당
			
	Tiger(int count) {
		this.count =  count;
	}
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}
class Eagle extends Animal{
	int count;
	Eagle(int count) {
		this.count =  count;
	}
	
	@Override
	void run() {
		System.out.println("독수리는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("독수리는 고기를 먹습니다.");
	}
}
class Fish extends Animal{
	int count;
	Fish (int count) {
		this.count =  count;
	}
	@Override
	void run() {
		System.out.println("물고기는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("물고기는 플랑크톤을 먹습니다.");
	}
}
class Dog extends Animal{
	int count;
	Dog(int count) {
		this.count =  count;
	}
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("개는 잔반을 먹습니다.");
	}
}
public class Using_Method_Overriding04 {
	
	public static void main(String[] args) {
		//1. 객체 생성
		// 1. 객체 생성 (Animal 타입으로 생성)
			//생산자를 통해서 각각의 필드에 값을 할당
		Animal a = new Animal();
		Tiger b  = new Tiger(10);
		Eagle c  = new Eagle(5);
		Fish d   = new Fish(50);
		Dog e    = new Dog(70);
	
		//객체를 배열에 저장
		Animal[] arr1 = new Animal [] {a,b,c,d,e};
		//For문을 사용해서 출력 : eat(), run() , 동물의 총 머릿수 총 머리수 : 00
			//1. For 문을 사용해서 객체를 Animal 객체로 뽑아서
			//2, 다운캐스팅 해서 자식 필드와 count 읽어서 총 더한 값을 출력
		
		int sum =0;
		for(int i = 0; i < arr1.length; i++) {
			
			//배열의 각 방에 저장된 객체를 Animal 객체에 저장
			Animal aa = arr1[i];
			aa.eat();		//Animal의 eat() 메소드 : 오버라이딩된 메소드 출력
			aa.run();		//Animal의 run() 메소드 : 오버라이딩된 메소드 출력
			
			if (aa instanceof Tiger) {
				Tiger t1 = (Tiger) aa;
				sum  += t1.count;		//sum = sum + t1.count
			}
			
			if (aa instanceof Eagle) {
				Eagle t1 = (Eagle) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
			
			if (aa instanceof Fish) {
				Fish t1 = (Fish) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
			
			if (aa instanceof Dog) {
				Dog t1 = (Dog) aa;
				sum += t1.count;		//sum = sum + t1.count
			}
		}
		System.out.println("총 동물의 수는 : " + sum);
	}
}
