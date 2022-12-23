package userregistration.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest {
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
        RegexTest valid = new RegexTest();
        boolean result = valid.validFirstName("Kir");
        Assertions.assertTrue(result);
    }
	
	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validLastName("Abc");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void givenMobileNo_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validMobileNo("91 9256729944");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validEmailId("abc@yahoo.com");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validPassword("kiran12345");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void givenPasswordContainOneCapital_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validPasswordOneCapital("Kiran12345");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void givenPasswordContainOneNumber_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validPasswordOneNumber("Kiran12345");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void givenPasswordContainOneSpecialCharacter_WhenValid_ShouldReturnTrue() {
		RegexTest valid=new RegexTest();
		boolean result=valid.validPasswordOneSpecialCharacter("Kiran@12345");
		Assertions.assertTrue(result);
	}
	
}
