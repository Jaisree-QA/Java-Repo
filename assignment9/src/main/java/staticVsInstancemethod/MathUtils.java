package staticVsInstancemethod;

public class MathUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathUtils.isPrime(45);
	System.out.println(isPerfectSquare(324));
	System.out.println(	isFibonacci(8));
	}

	static boolean isPrime(int number) { // - checks if number is prime
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Not, Prime");
				return false;
			}
		}
		System.out.println("Yes, Prime");
		return true;
	}

	static boolean isPerfectSquare(int number) { // - checks if number is a perfect square
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }



	

	static boolean isFibonacci(int number) { 		// - checks if number is in Fibonacci sequence
	    if (number == 0 || number == 1) 
	    	return true;  // 0 and 1 are Fibonacci numbers

	    int a = 0, b = 1, c = a + b;
	    while (c <= number) {
	        if (c == number) {
	            return true; // found the number in the sequence
	        }
	        a = b;		//1	1	2	3
	        b = c;		//1	2	3	5
	        c = a + b;	//2	3	5	8
	    }
	    return false; // number is not in Fibonacci sequence
	}

	}

	
