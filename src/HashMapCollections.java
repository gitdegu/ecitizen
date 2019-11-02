import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class HashMapCollections {
	
	public static void readingHashMap(Map <String,String> coll) {
		for (Map.Entry<String, String> entry : coll.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
	}
	
	public static void readingHasMapOtherMethod_01(Map <String,String> coll) {
		coll.forEach((key,value) -> System.out.println(key + " = " + value));
	}
	
	public static void readingHasMapOtherMethod_02(Map <String,String> coll) {
		Iterator<Entry<String, String>> it = coll.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>hmap=new HashMap<String,String>();
		hmap.put("Eng","English");
		hmap.put("Mth","Maths");
		hmap.put("Psy", "Physics");
		hmap.put("Bio","Biology");
		readingHashMap(hmap);
		System.out.println("...........");
		readingHasMapOtherMethod_01(hmap);
		System.out.println("...........");
		readingHasMapOtherMethod_02(hmap);
	}

}
