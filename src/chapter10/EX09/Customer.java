package chapter10.EX09;

public class Customer {
	
		int customerID;				//고객 ID
		String CustomerName;		//고객 이름
		String customerGrade;		//고객 등급 (VIP, Gold, Silver)
		int bonuspoint;				//고객의 등급에 따라서 포인트 적립
		double bonusRatio;			//물품구매시 할인율
		
		Customer(){
			//필드의 기본 값 할당을 메소드 호출로 적용
			this.initCustomer();		//this,initCustomer() , 자신객체의 메서드 호출
		}

		Customer(int customerID, String customerName){
			this.customerID = customerID;
			this.CustomerName = customerName;
		}
		
		void initCustomer() {
			this.customerGrade = "Silver";
			this.bonusRatio = 0.01;
	}
		
		
	public static void main(String[] args) {
		
		

		
	}

}
