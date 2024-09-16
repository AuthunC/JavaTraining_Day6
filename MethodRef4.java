package day6;

public class MethodRef4 {
	public static int factorialOfNum(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}
}
