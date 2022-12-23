package userregistration.com;

import java.util.regex.Pattern;

public class RegexTest {

	public boolean validFirstName(String string) {
		boolean result=Pattern.matches("^[A-Z]{1}[a-z]{2,}$", string);
		return result;
	}

	public boolean validLastName(String string) {
		boolean result=Pattern.matches("^[A-Z]{1}[a-z]{2,}$", string);
		return result;
	}

	public boolean validMobileNo(String string) {
		boolean result=Pattern.matches("^([0-9]{2}[ ][1-9]{1}[0-9]{9})$", string);
		return result;
	}

	public boolean validEmailId(String string) {
		boolean result=Pattern.matches("^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$", string);
		return result;
	}

	public boolean validPassword(String string) {
		boolean result=Pattern.matches("^([A-Za-z0-9]{8,})$", string);
		return result;
	}

	public boolean validPasswordOneCapital(String string) {
		boolean result=Pattern.matches("^((?=.*[A-Z])[A-Za-z0-9]{8,})$", string);
		return result;
	}

	public boolean validPasswordOneNumber(String string) {
		boolean result=Pattern.matches("^((?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,})$", string);
		return result;
	}

	public boolean validPasswordOneSpecialCharacter(String string) {
		boolean result=Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$", string);
		return result;
	}
	

}
