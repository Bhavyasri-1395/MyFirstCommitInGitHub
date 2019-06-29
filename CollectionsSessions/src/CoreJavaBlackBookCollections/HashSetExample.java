package CoreJavaBlackBookCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<Object>();
		hs.add("Bhavyasri");
		hs.add(1);
		hs.add('a');
		hs.add("Sush");
		hs.add("Sush");
		hs.remove("Sush");
		System.out.println("Hashset Elements : " +hs);
		
		//Printing the elements using iterator.
		
//		Iterator it = hs.iterator();
//		while(it.hasNext()) {
//			String s = (String)it.next();
//			System.out.println(s);
//		}
		System.out.println(hs.contains("Bhavyasri"));
		System.out.println(hs.size());
	}

}
