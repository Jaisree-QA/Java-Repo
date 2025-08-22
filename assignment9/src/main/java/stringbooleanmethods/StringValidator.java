package stringbooleanmethods;

public class StringValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringValidator obj = new StringValidator();
		obj.isEmpty("HappyDay");
		obj.isEmpty("");
		obj.hasOnlyDigits("9449");
		obj.startsWithVowel("range");
		obj.isPalindrome("121214");

	}

	public boolean isEmpty(String str) { // - returns true if string is null or empty
		if (str.isEmpty()) {
			System.out.println("String don't have a value");
			return true;
		} else {
			System.out.println("String has a value : " + str);

			return false;
		}

	}

	public boolean hasOnlyDigits(String str) { // - returns true if string contains only digits
		if (str == null || str.isEmpty()) {
			System.out.println("Sting is empty");
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				System.out.println("Non digit is founded");

				return false; // if any character is not a digit
			}
		}
		System.out.println("String contains only digit");
		return true;
	}

	public boolean startsWithVowel(String str) { // - returns true if string starts with a vowel

		char arr[] = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == str.charAt(0)) {
				System.out.println("Starting indices is a vowel : " + arr[i] + "\t" + str);
				return true;

			}
		}
		System.out.println("Not starting with vowel");
		return false;
	}

	public boolean isPalindrome(String str) {

		StringBuffer ob = new StringBuffer(str);
		String reversed = ob.reverse().toString();
		System.out.println("Reversed number is : " + reversed + "\n" + " Before Reverse : " + str);

		if (str.equals(reversed)) {

			System.out.println("yes it's a Palindrome");
			return true;

		} else {
			System.out.println("No, not a palindrome");
			return false;

		}
	}
}
