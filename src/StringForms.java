import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class StringForms {
	
	public static List<String> addStringList() {
		ArrayList<String>listOfName= new ArrayList<String>();
		listOfName.add("Tigist");
		listOfName.add("Yonas");
		listOfName.add("Adnew");
		listOfName.add("Kabetamua");
		listOfName.add("Eliase");
		return listOfName;
	}
	
	public static List<String> sortingStringAscending(Vector<String> addStringList){
		Enumeration<String> el = addStringList.elements(); 
		ArrayList<String>arrangedLists= new ArrayList<String>();
		arrangedLists=Collections.list(el);
		 Collections.sort(arrangedLists);
		 return arrangedLists;
	}
	
	public static List<String> sortingStringDescending(Vector<String> addStringList){
		Enumeration<String> el = addStringList.elements(); 
		ArrayList<String>arrangedLists= new ArrayList<String>();
		arrangedLists=Collections.list(el);
		Collections.sort(arrangedLists,Collections.reverseOrder());
		return arrangedLists;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("All the name=" +  addStringList());
		Vector<String>listOfName= new Vector<String>();
		listOfName.add("Z");
		listOfName.add("B");
		listOfName.add("C");
		listOfName.add("X");
		System.out.println("All the name ASC=" +  sortingStringAscending(listOfName));
		System.out.println("All the name DESC=" +  sortingStringDescending(listOfName));
	}

}
