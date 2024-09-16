package day6;

public class AllLambdaImplementation {

	public static void main(String[] args) {
		//1st
		
		//Using lambda
		LambdaInterface1 l1 = (x,y) -> {
			return (int) Math.pow(x, y); 
			
		};
		int aPowerB = l1.aPowerB(2, 3);
		System.out.println(aPowerB);
		
		//using method reference
		l1= MethodRef1::power;
		System.out.println(l1.aPowerB(2, 3));
		
		
		//2nd
		
		//Using Lambda
		LambdaInterface2 l2 = (x -> {
			String ans = "";
			for(int i=0;i<x.length();i++) {
				if(x.charAt(i) != ' ') {
					ans += x.charAt(i) + " ";
				}
			}
			return ans;
		});
		System.out.println(l2.spacesString("   AA"));
		
		//using method reference
		l2=MethodRef2::spacedString;
		System.out.println(l2.spacesString("ABCD"));
		
		//3rd
		
		//Using lambda
		LambdaInterface3 l3 = (x,y) -> {
			String customUserName = "authun";
			String customPassword = "123456";
			if(x.equals(customUserName) && y.equals(customPassword))
				return true;
			else {
				return false;
			}			
		};
		System.out.println(l3.validate("Authun", "123456"));
		System.out.println(l3.validate("authun", "123456"));
		
		////using method reference
		l3=MethodRef3::validateCredentials;
		System.out.println(l3.validate("Authun", "1234"));
		
		//4th
		
		//using Lambda
		LambdaInterface4 l4 = (x -> {
			int fact = 1;
			for(int i=1;i<=x;i++) {
				fact *= i;
			}
			return fact;
		});
		System.out.println(l4.factorial(5));
		
		//Using method Reference
		l4=MethodRef4::factorialOfNum;
		System.out.println(l4.factorial(4));
	}
}
