import java.util.ArrayList;
import java.util.List;

public class TestFileOrder {
	
	public static ArrayList<String>fileType=new ArrayList<String>();
	
	@SuppressWarnings("null")
	public static boolean checkFielOrder(ArrayList<String> fileTypes) {
		
		List<String>actualOrder=new ArrayList<String>();
		List<Integer>fileTypeIndex=new ArrayList<Integer>();
		
		boolean correctFileOrder=false;
		for(int i=0;i<fileType.size();i++) {
			if(actualOrder==null) {
				actualOrder.add(fileType.get(i));
				fileTypeIndex.add(i);
			}
			else if(actualOrder.contains(fileType.get(i))) {
				continue;
			}
			else if(!actualOrder.contains(fileType.get(i))) {
				actualOrder.add(fileType.get(i));
				fileTypeIndex.add(i);
			}
			
		}
		fileTypeIndex.add(fileTypes.size());
		System.out.println(actualOrder);
		System.out.println(fileTypeIndex);
		
		ArrayList<String>newOrders=new ArrayList<String>();
		if(actualOrder.contains("zip")) {
			newOrders.add(actualOrder.get(actualOrder.indexOf("zip")));
		}
		if(actualOrder.contains("folder")) {
			newOrders.add(actualOrder.get(actualOrder.indexOf("folder")));
		}
		for(int z=0;z<actualOrder.size();z++) {
			if(!actualOrder.get(z).equalsIgnoreCase("zip") && !actualOrder.get(z).equalsIgnoreCase("folder")) {
				newOrders.add(actualOrder.get(z));
			}
			
		}
		System.out.println(newOrders);
		actualOrder=newOrders;
		
		int indexLooker=0;
		for(int i=0;i<actualOrder.size();i++) {
			for(int y=fileTypeIndex.get(i);y<fileTypeIndex.get(indexLooker+1);y++) {
				if(actualOrder.get(i).equalsIgnoreCase(fileType.get(y))) {
					correctFileOrder=true;
				}
				else {
					correctFileOrder=false; 
					break;
				}
			}
			indexLooker++;
			if(!correctFileOrder)break;
		}
		
		if(correctFileOrder)
			return true;
	
		return false;
	}
	
	
	public static void main(String args[]) {
		
		
		fileType.add("folder");
		fileType.add("folder");
		fileType.add("zip");
		fileType.add("pdf");
		fileType.add("folder");
	
		/*
		 * Check the correct file format order
		 * Zip, Folder, and single file
		 * */
		
		
		boolean x=TestFileOrder.checkFielOrder(fileType);
		System.out.print(x);

		
	}	
		
}
