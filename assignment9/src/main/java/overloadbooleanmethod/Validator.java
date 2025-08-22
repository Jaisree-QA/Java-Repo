package overloadbooleanmethod;

import java.util.Scanner;

public class Validator {
static	int num2 = 500;

	// boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("checking with valid number is : "+num2);
		Validator ob = new Validator();
		System.out.println(ob.isValid(50));
		System.out.println(ob.isValid(15.3));
		System.out.println(ob.isValid("tomato"));
		System.out.println(ob.isValid(false));
	}

	public boolean isValid(int number) {
		// - returns true if number is between 1 and 100
		if (number <= num2 || num2 == 0) {
			System.out.println("checking int number : " + number);

			return true;
		}
		System.out.println("checking int number : " + number);

		return false;
	}

	public boolean isValid(double number) {
//- returns true if number is between 1.0 and 100.0
		if (number <= num2 || num2 == 0) {
			System.out.println("checking double number : " + number);

			return true;
		}
		System.out.println("checking double number : " + number);

		return false;
	}

	public boolean isValid(String text) {
//- returns true if text is not null and length > 0
		if (text == null || text.length() > 0) {
			System.out.println("checking text : " + text);
			return true;
		}
		System.out.println("checking text : " + text);
		return false;
	}

	public boolean isValid(boolean flag) {
//- simply returns the flag value
		System.out.println("checking flag : " + flag);
		return flag;

	}
}
