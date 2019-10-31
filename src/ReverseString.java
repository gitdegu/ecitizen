
public class ReverseString {
	
	public static String reverseAnyStrings(String sampleStr) {
		StringBuilder reversedStr=new StringBuilder();
		for(int i=sampleStr.length()-1;i>=0;i--) {
			reversedStr.append(sampleStr.charAt(i));
		}
		return reversedStr.toString();
	}
	
	public static String returnFullStirng(String left, String right) {
		return left.concat(right);
	}
	
	public static void main(String args[]) {
		
		String fullName="Alber Samuel";
		System.out.println("Reversed String is=" + ReverseString.reverseAnyStrings(fullName));
		String str1="Lea ";
		String str2="keo";
		System.out.println("Full String=" + returnFullStirng(str1,str2));
		
	}

}
