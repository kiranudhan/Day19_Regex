package userregistration.com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	 //UC1
    public static void validFirstName() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String name=sc.nextLine();
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$",name));
	}
    
    //UC2
    public static void validLastName() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Last name:");
		String LastName=sc.nextLine();
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$",LastName));
    }
    
    //UC3
    public static void validEmailId() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter email : ");
		String email=sc.nextLine();
		System.out.println(Pattern.matches("^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$",email));
    }
    
    //UC4
    public static void validMobileNo() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile no:");
		String mobileNo=sc.nextLine();
		System.out.println(Pattern.matches("^([0-9]{2}[ ][1-9]{1}[0-9]{9})$",mobileNo));
    }
    
    //UC5
    public static void validPasswordEightDigit() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		System.out.println(Pattern.matches("^([A-Za-z0-9]{8,})$",password));
    }
   
    //UC6
    public static void validPasswordOneCapital() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		System.out.println(Pattern.matches("^((?=.*[A-Z])[A-Za-z0-9]{8,})$",password));
    }
    
    //UC7
    public static void validPasswordOnedigit() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		System.out.println(Pattern.matches("^((?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,})$",password));
    }
    
    //UC8
    public static void validPasswordOneSpecialChar() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		System.out.println(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$", password));
   }

	public static void main(String[] args) {
	      validFirstName();
         validLastName();
         validEmailId();
         validMobileNo();
         validPasswordEightDigit();
         validPasswordOneCapital();
         validPasswordOneCapital();
         validPasswordOneSpecialChar();

	}

}
