package chapter10.EX09;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	VIPCustomer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonuspoint = 10;
	}
	VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonuspoint = 10;
	}
	//교재 10장 339p super까지
}
