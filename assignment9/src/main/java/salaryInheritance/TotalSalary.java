package salaryInheritance;

public class TotalSalary extends BasicDed {

void salarySlip() {
double salarySlip=  a + hra - pf - b + c ;
		
		//basicpay+hra-pf-deduction+bonus
		
		System.out.println("Total Salary ="+salarySlip);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary obj = new TotalSalary();
		obj.payment();
		obj.calcHra();
		obj.salarySlip();

		
	}

}
