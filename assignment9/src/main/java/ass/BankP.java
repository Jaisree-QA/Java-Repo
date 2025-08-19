package ass;

public class BankP {
	int accNo,balance;

	void deposit(int accNo,int balance){
		this.accNo=accNo;
		this.balance=balance;

	}
	
	void depositDisplay() {
		System.out.println("Account Number: "+this.accNo+"\n"+"Balance Amount: "+this.balance);
	}
	
}
