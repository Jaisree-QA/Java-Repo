package overloadbooleanmethod;

public class DataProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataProcessor ob = new DataProcessor();
	System.out.println(ob.process(55));	
	System.out.println(ob.process(12.46));	
	System.out.println(ob.process("HappyMe"));	
	System.out.println(ob.process(false, 45));	
	}

	public boolean process(int number) {				 // - returns boolean (true if even)
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	public int process(double number) { 					// - returns int (rounded value)
		int roudedValue =  (int) Math.round(number);
		return roudedValue;
	}

	public boolean process(String text) { // - returns boolean (true if length > 5)

		if (text.length() > 5) {
			return true;
		}
		return false;
	}

	public String process(boolean flag, int number) { // - returns String describing the combination
if (flag==true) {
	
	return "describing the true value"+ number ;
}else {
	return "describing the false value"+ number ;

}
		
	}
}
