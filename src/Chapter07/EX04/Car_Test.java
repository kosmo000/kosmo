package Chapter07.EX04;

class Car {
	
	//1. 필드
	String company;		//제조회사
	String model;		//자동차 모델
	String color;		//자동차 색깔
	double maxSpeed;	//자동차 최대출력
	public String getCompany() {
		return company;
	}
	
	//2. 생성자
	
	Car () {	
	}
	
	Car (String s) {
		company = s;
	}
	
	Car (String comapny, String model) {
		this.company=company;
	}
	
	Car (String company, String model, String color, double maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	//3. 메소드 (show : 필드의 값을 출력)
	void show () {
		System.out.println(company + "," + model + "," + color + "," + maxSpeed);
	}
	
	//4. 메소드 (getter/setter)
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	
	
}

public class Car_Test {

	public static void main(String[] args) {
		//객체 생성
		// car1		현대자동차 그랜져		<== 필드의 값을 직접 입력/출력
		Car Car = new Car ("그랜져");
		Car.company="현대";
		Car.model="그랜져";
		Car.color="흰색";
		Car.maxSpeed=250;
		
		System.out.println(Car.company);
		System.out.println(Car.model);
		System.out.println(Car.color);
		System.out.println(Car.maxSpeed);
		// car2		쌍용자동차 체어맨		<== 생성자를 통해서 값 입력 / show() 값 출력
		Car chairman= new Car ("쌍용", "체어맨", "검정색", 200);
		
		System.out.println(Car.company);
		System.out.println(Car.model);
		System.out.println(Car.color);
		System.out.println(Car.maxSpeed);
		
		chairman.show();
		// car3		기아자동차 k9		<== setter를 통해서 값 입력 / getter를 통해서 값출력
		
		Car k9 = new Car();
		
		k9.setCompany("기아");
		k9.setModel("k9");
		k9.setColor("파란색");
		k9.setMaxSpeed(220);
		
		System.out.println(k9.getCompany());
		System.out.println(k9.getModel());
		System.out.println(k9.getColor());
		System.out.println(k9.getMaxSpeed());
		
		k9.show();
	}

}
