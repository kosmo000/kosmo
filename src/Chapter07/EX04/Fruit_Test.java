package Chapter07.EX04;

class Fruit{
	
	//1. 필드
	String name ;	//과일 이름
	String color;	//과일 색깔
	int count ;		//과일 갯수
	int sugarContent;	//과일의 당도
	
	//2. 생성자
	
	Fruit () {
	}
	Fruit (String s) {
		name = s;
	}
	Fruit (String name, String color) {
		this.name=name;
	}
	Fruit (String name, String color, int count, int sugarContent) {
		this.name=name;
		this.color=color;
		this.count=count;
		this.sugarContent=sugarContent;
	}
	//3. show() : 필드의 값을 모두 출력 하는 메소드
	void show () {
		System.out.println(name + "," + color + "," + count + "," + sugarContent);
	}
	
	//4. getter / setter 메소드
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
		
	
	
	
	
	
	
}

public class Fruit_Test {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본 값을 직접 일력 후 / 직접 출력
			//필드의 값 셋팅 (직접)
		Fruit banana = new Fruit();
		banana.name = "바나나";
		banana.color = "노란색";
		banana.count = 10;
		banana.sugarContent = 8;
		
			//필드의 값 출력
		System.out.println("====banana 객체 출력==");
		System.out.println(banana.name);
		System.out.println(banana.color);
		System.out.println(banana.count);
		System.out.println(banana.sugarContent);
		
		
		// 2. apple 객체 : 생성자를 사용해서 4개의 필드에 초기값 할당. show()출력
		
		Fruit apple = new Fruit("apple", "초록색", 5, 9);
		System.out.println(banana.name);
		System.out.println(banana.color);
		System.out.println(banana.count);
		System.out.println(banana.sugarContent);
		
		apple.show();
		// 3. strawberry : setter를 사용해서 4개의 필드에 값 할당 . getter 사용해서 출력
		
		Fruit strawberry = new Fruit();
		
		strawberry.setName("strawberry");
		strawberry.setColor("빨간색");
		strawberry.setCount(15);
		strawberry.setSugarContent(12);
		
		System.out.println(strawberry.getName());
		System.out.println(strawberry.getColor());
		System.out.println(strawberry.getCount());
		System.out.println(strawberry.getSugarContent());
		
		strawberry.show();
		

	}

}
