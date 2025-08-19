package ass;

public class AccountC {
	int withdrawAmount;
	String accName;
	BankP bankP;
	
	void withdrawDisplay(String depositorName,int withdrawAmount ,BankP bankP ) {
		this.accName=depositorName;
		this.bankP=bankP;
		this.withdrawAmount=withdrawAmount;
		
System.out.println("AccountHolderName: "+this.accName +"\n"+
					"Withdraw Amount: "+this.withdrawAmount +"\n"+
					"Total Savings Amount: "+bankP.balance);
bankP.deposit(100000023, 25000);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankP ob = new BankP();
		BankP ob1 = new BankP();

		ob.deposit(100000012, 5500000);
		ob1.deposit(1000000013, 95000000);
		ob.depositDisplay();
		ob1.depositDisplay();
		System.out.println();
		AccountC ss = new AccountC();
		ss.withdrawDisplay("Alexander",21520, ob1);
		System.out.println();
		ss.withdrawDisplay("Manuu",14000, ob);
	}

}
