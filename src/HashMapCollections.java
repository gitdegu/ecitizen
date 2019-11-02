import java.util.HashMap;
import java.util.Map;
public class HashMapCollections {
	
	public static void showingAllValues(Map<String,String> coll) {
		System.out.println(coll.values());
	}
	
	public static void showingAllKeys(Map<String,String> coll) {
		System.out.println(coll.keySet());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>hmap=new HashMap<String,String>();
		hmap.put("Eng","English");
		hmap.put("Mth","Maths");
		hmap.put("Psy", "Physics");
		hmap.put("Bio","Biology");
		showingAllValues(hmap);
		System.out.println("..........");
		showingAllKeys(hmap);
	}

}
