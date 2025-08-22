package boolmethodreturntype;

public class Calculator {
	static int a = 10;
	static int b = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
	System.out.println(obj.getSum(a, b));
	System.out.println(obj.getAverage(a, b));
	System.out.println(obj.getResult(a, b));
	System.out.println(obj.canDivide(a, b));
	}

	public int getSum(int a, int b) {
		return a + b;
	}

	public double getAverage(int a, int b) { // - returns double
		return (a + b) / 2;
	}

	public String getResult(int a, int b) {
		// - returns String describing which number is larger
		if (a > b) {
			return "a is greater : " + a;
		} else {

			return "b is greater : " + b;

		}
	}

	public boolean canDivide(int a, int b) {
		// - returns boolean indicating if division is possible (b != 0)
		if (b != 0) {

			System.out.println("b value is not equal to zero hence it's ");
			return true;
		} 
		return false;
		}

	}

