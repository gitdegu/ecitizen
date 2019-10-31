import javax.xml.stream.events.Characters;

public class TestingNumberOrNot {

	
	public static boolean isNumber(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="7L";
		System.out.println("Does the" + input +"="+ TestingNumberOrNot.isNumber(input));
		input="76";
		System.out.println("Does the" + input +"="+ TestingNumberOrNot.isNumber(input));
	}

}
