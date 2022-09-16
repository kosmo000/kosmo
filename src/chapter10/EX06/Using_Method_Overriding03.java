package chapter10.EX06;



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
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("개는 잔반을 먹습니다.");
	}
}
public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		
		Animal aa = new Animal();
		Tiger bb = new Tiger();
		Eagle cc = new Eagle();
		Fish dd = new Fish();
		Dog ee = new Dog();
		
		aa.run();
		aa.eat();
		bb.run();
		bb.eat();
		cc.run();
		cc.eat();
		dd.run();
		dd.eat();
		ee.run();
		ee.eat();
		
		
		
		//배열에 객체를 저장 : Animal객체를 배열에 지정
		
		Animal[] arr1 = new Animal [] {aa,bb,cc,dd,ee};
		
		//For 문을 사용해서 배열의 내용을 출력
		System.out.println("==For 문을 사용해서 출력 ==");
		
		
		//Enhanced For 문을 사용해서 출력
		System.out.println("==Enhanced For를 사용해서 출력 ==");
		for (Animal k: arr1) {
			k.eat();
			k.run();
		}

	}

}
