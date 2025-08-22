package staticVsInstancemethod;

public class PasswordValidator {
	private static String password = "Abc353%";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordValidator pv = new PasswordValidator();
		System.out.println(pv.hasMinLength(password, 10));
		System.out.println(pv.hasUppercase(password));
		System.out.println(pv.hasDigit(password));
		System.out.println("checking the whole method");
		System.out.println(pv.isStrongPassword(password));
	}

	public boolean hasMinLength(String password, int minLength) { // - returns boolean
		// this.password = password;

		if (password.length() <= minLength) {
			return true;
		}
		return false;
	}

	public boolean hasUppercase(String password) { // - returns boolean

		for (char ch : password.toCharArray()) {

			if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
				return true;

			}
		}
		return false;
	}

	public boolean hasDigit(String password) { // - returns boolean

		for (char ch : password.toCharArray()) {
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	public boolean isStrongPassword(String password) { // - returns boolean (combines all checks)

		if (hasUppercase(password) && hasDigit(password) && hasMinLength(password, 10) == true) {

			return true;

		}
		return false;

	}
}
