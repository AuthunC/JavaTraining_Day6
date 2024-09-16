package day6;

public class MethodRef3 {
	public static boolean validateCredentials(String name, String pass) {
		String customUserName = "authun";
		String customPassword = "123456";
		if(name.equals(customUserName) && pass.equals(customPassword))
			return true;
		else {
			return false;
		}			
	};
}
