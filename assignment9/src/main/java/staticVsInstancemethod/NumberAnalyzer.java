package staticVsInstancemethod;

public class NumberAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(	isOdd(23));
	System.out.println(	getNumberType(8));
		
		NumberAnalyzer ob= new NumberAnalyzer();
		System.out.println(ob.isGreaterThanTen(56));
	System.out.println(	ob.analyzeNumber(50));
	}
public	static boolean isOdd(int number) { 									//- static method
	if(number%2==1) {
		System.out.println("Odd Number");
		return true;
	}
	return false;
}


public	boolean isGreaterThanTen(int number) 	{							//- instance method
if(number>=10) {
	return true;
}
return false;
	
}
public	static String getNumberType(int number)	{							// - returns "odd" or "even"
	if(number%2==1) {
		return "odd number : "+ number;
	}
	return "Even number : "+ number;
}
	

public String analyzeNumber(int number) {									//- instance method that uses static methods
	
	StringBuilder result = new StringBuilder();
    // Use static method getNumberType once
    result.append(getNumberType(number)).append("\n");

    // Use instance method isGreaterThanTen
    result.append("- It is ")
          .append(isGreaterThanTen(number) ? "greater than or equal to 10." : "less than 10.");

    return result.toString();
}
}
