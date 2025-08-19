package salaryInheritance;

public class BasicDed extends BasicPay{
	double hra,pf;
	void calcHra() {
		hra= a*10/100;
	 pf=a*5/100;
		
System.out.println("House rented allowance: "+hra+ "\n" +
" PF amount : " +pf+ "\n");
	

}
}
