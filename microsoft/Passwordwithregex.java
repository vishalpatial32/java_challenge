package microsoft;

public class Passwordwithregex {
public static void main(String[] args) {
	
	String str = "FooBar123!";
	
	if(passwd_validate(str)) {
		System.out.println("string is valid");
	}
	else {
		System.out.println("string is not valid");
	}
}

private static boolean passwd_validate(String str) {
	// TODO Auto-generated method stub
	
	String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$";
	//String pattern1= "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$";

	if(str.contains(pattern)) {
		return true;
	}
	
	return false;
}
}
