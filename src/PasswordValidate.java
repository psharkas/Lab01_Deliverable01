import java.util.Scanner;

public class PasswordValidate {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Your password must be 7-12 characters long and contain: one lowercase letter, one uppercase letter, and an exclamation point.");
		System.out.println("Please enter a password: ");
		String pwValidate = scnr.nextLine();
		System.out.println("Your password is: " + pwValidate);
		
		int length = pwValidate.length();
		boolean checkLowercase = false;
		boolean checkUppercase = false;
		boolean checkExclamation = false;
		char check;
	
		for(int i = 0; i < length; i++) {
			check = pwValidate.charAt(i);
			
			if(Character.isLowerCase(check)) {
				checkLowercase = true;
			}
			
			else if (Character.isUpperCase(check)) {
				checkUppercase = true;
			}
		}
		
		if (pwValidate.contains("!")) {
			checkExclamation = true;
		}
		
		if (length >= 7 && length <= 12 && checkLowercase && checkUppercase && checkExclamation){
			System.out.println("Password valid and accepted.");
		}
		
		else {
			System.out.println("Error, password does not meet one or more requirements.");
		} 		
	}
}
