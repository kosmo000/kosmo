package testHbg2;

public class MenuVO {
	
	private String menu;	// 메뉴 지정
	private int price;		// 가격 지정
	
	@Override
	public String toString() {
		return "메뉴: " + menu + "\t\t" + "가격: " + price + "원\n";
		// 오버라이딩하여 메뉴에 메뉴 값과 가격에 가격 값 넣음
	}
	
	public MenuVO () {}
	
	public MenuVO (String menu, int price) {
		super();	//부모의 생성자 호출
		this.menu = menu;	// 메뉴 참조
		this.price = price; // 가격 참조
	}

	public String getMenu() {	// 메뉴 가져오기
		return menu;	// 리턴 메뉴
	}

	public void setMenu(String menu) {	//메뉴 넣기
		this.menu = menu;	//메뉴 참조
	}	

	public int getPrice() {	// 가격 가져오기
		return price;	// 리턴 가격
	}

	public void setPrice(int price) {	// 가격 넣기
		this.price = price;	// 가격 참조
	}


	

}

