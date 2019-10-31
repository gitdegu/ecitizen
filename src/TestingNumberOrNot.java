import javax.xml.stream.events.Characters;

public class TestingNumberOrNot {

	
	public static boolean isNumberForInt(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && str.charAt(i)!='.') {
				return false;
			}
		}
		return true;
	}

	public static boolean doesAllCollectionsAreNumbers(String []strCollection) {
		int i=0;
		while(i<strCollection.length) {
			for(int j=0;j<strCollection[i].length();j++) {
				if(!Character.isDigit(strCollection[i].charAt(j)) && strCollection[i].charAt(j)!='.') {
					return false;
				}
			}
			i++;
		}
		return true;
}
	
	public static boolean isNumberForDeciamls(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && str.charAt(i)!='.') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputInteger="7L";
		System.out.println("Does the string" + inputInteger +"="+ TestingNumberOrNot.isNumberForInt(inputInteger));
		inputInteger="76";
		System.out.println("Does the string" + inputInteger +"="+ TestingNumberOrNot.isNumberForInt(inputInteger));
		
		String inputDecimal="78.90";
		System.out.println("Does the string" + inputDecimal +"="+ TestingNumberOrNot.isNumberForDeciamls(inputDecimal));
		inputDecimal="78.9x";
		System.out.println("Does the string" + inputDecimal +"="+ TestingNumberOrNot.isNumberForDeciamls(inputDecimal));
		
		String []inputStr= {"67.54","134.89"};
		System.out.println("Does the string" + inputStr +"="+ TestingNumberOrNot.doesAllCollectionsAreNumbers(inputStr));
		
	}

}
