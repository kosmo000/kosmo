package chapter10.EX01;


class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든사람은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든사람은 잠을 잡니다.");
	}
	void print() {
		System.out.println(name + "," + age);
	}
}

class Student extends Human{
	int studentID;
	void gotoSchool() {
		System.out.println("모든 학생은 학교에 갑니다.");
	}
}

class Worker extends Human {
	int wokerID;
	void goToWokrk () {
		System.out.println("모든 직장인은 직장에 갑니다.");
	}
}

class Collage extends Human {
	int CollageID;
	void goToCollage () {
		System.out.println("모든 교수는 대학교에 갑니다.");
	}
}
public class Using_Inheritance01 {

	public static void main(String[] args) {
		// 객체 생성
		Human h = new Human();
		h.name = "홍길동";
		h.age = 18;
		h.eat();
		h.sleep();
		h.print();
		

	}

}
