package assignmentpolymorphism;

import java.util.Scanner;

public class OnSeason {
	double purchaseAmount;
	
	void purchase(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total amount purchased: ");
		purchaseAmount=sc.nextDouble();
	
	}
	void discount(){
		
		double discountamount=purchaseAmount*0.40;
		
		System.out.println("Discounted amount from OnSeason: "+discountamount);
	}

}
