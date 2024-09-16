package day6;

public class MethodRef2 {
	public static String spacedString(String x) {
		String ans = "";
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i) != ' ') {
				ans += x.charAt(i) + " ";
			}
		}
		return ans;
	};
}
