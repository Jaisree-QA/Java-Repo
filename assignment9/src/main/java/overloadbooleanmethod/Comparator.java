package overloadbooleanmethod;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator ob = new Comparator();
		System.out.println(ob.compare(123, 96));
		System.out.println(ob.compare(72.5, 31.923));
		System.out.println(ob.compare("bloshy", "aloshy"));
	}

	public boolean compare(int a, int b) { // - returns boolean (true if a > b)
		if (a > b) {
			return true;
		} else {
			return false;
		}

	}

	public boolean compare(double a, double b) { // - returns boolean (true if a > b)
		if (a > b) {
			return true;
		} else {
			return false;
		}

	}

	public boolean compare(String a, String b) { // - returns boolean (true if a comes after b alphabetically)

		if (a.compareToIgnoreCase(b)>0) {
			return true;
		}
		return false;

	}
}
/*
 
 Explanation:

a.compareToIgnoreCase(b) returns:

0 → if both are equal

< 0 → if a comes before b

> 0 → if a comes after b
 
*/