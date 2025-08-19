package salaryInheritance;

import java.util.Scanner;

public class BasicPay {
	double a,b,c;
	
	//public void payment(int salary,int ded,int bonus) {


	public void payment() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the basic pay: ");
		a= sc.nextDouble();
		System.out.println("Deduction: ");
		b=sc.nextDouble();
		System.out.println("Bonus: ");
		c=sc.nextDouble();
		
		System.out.println("Basic salary ="+a + "\n"
		+ "Deduction =" + b + "\n"
		+"Bonus ="+c + "\n");
	}
	
}
