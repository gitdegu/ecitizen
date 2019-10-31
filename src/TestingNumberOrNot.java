import javax.xml.stream.events.Characters;

public class TestingNumberOrNot {

	
	public static boolean isNumber(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && str.charAt(i)!='.') {
				return false;
			}
		}
		return true;
	}
	public static boolean findNumberFromACollection(String []strCollection) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="7L";
		System.out.println("Does the" + input +"="+ TestingNumberOrNot.isNumber(input));
		input="76";
		System.out.println("Does the" + input +"="+ TestingNumberOrNot.isNumber(input));
		String []inputStringSet= {"78.54","9t.65"};
		System.out.println("The String seques " + inputStringSet +"="+ findNumberFromACollection(inputStringSet));
	}

}
