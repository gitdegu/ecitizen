
public class ReverseString {
	
	public static String reverseAnyStrings(String sampleStr) {
		StringBuilder reversedStr=new StringBuilder();
		for(int i=sampleStr.length()-1;i>=0;i--) {
			reversedStr.append(sampleStr.charAt(i));
		}
		return reversedStr.toString();
	}
	
	public static void main(String args[]) {
		
		String fullName="Alber Samuel";
		System.out.println("Reversed String is=" + ReverseString.reverseAnyStrings(fullName));
		
	}

}
