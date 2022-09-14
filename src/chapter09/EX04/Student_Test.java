package chapter09.EX04;

class Student{
	
	
	static int seriolNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할때 마다 1씩 증가
	int studentID;			//학생 공유ID
	String studentName;		//학생 이름
	int grade;				//학년 : 기본값으로 4 학년
	String address;			//주소 : "서울"
	
	//기본 생성자
	Student () {
		seriolNum++;	//객체를 생성시 1씩 증가, 모든 객체에서 공유해서 사용
		studentID = seriolNum;
		grade = 4;
		address = "서울";
	}
	
	Student (String studentname) {
		this();		// 기본 생성자 호출 후 아래내용 실행
		this.studentName = studentname;
	}
	
	
	
	void print () {
		System.out.println("학번 :" + seriolNum);
		System.out.println("학생 공유ID :" + studentID);
		System.out.println("학생이름 :" + studentName);
		System.out.println("학년 :" + grade);
		System.out.println("주소 :" + address);
	}
	
	
	
	
}

public class Student_Test {

	public static void main(String[] args) {
		
		
		//객체를 생성시 자동으로 학번이 1000부터 1식 자동으로 학번이 저장되어야 한다.
		//studentID : 1000 부터 학생객체를 생성할때 마다 고유한 값으로 적용 되어 있어야 한다.
		
		Student lee = new Student("이지원");	//1001
			lee.print();
		Student hong = new Student("홍지원");	//1002
			hong.print();
		Student jung = new Student("정지원");	//1003
			jung.print();
		Student park = new Student("박지원");	//1004
			park.print();
	}

}
