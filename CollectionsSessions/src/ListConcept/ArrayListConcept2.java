package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>( Arrays.asList("alex", "brian", "charles") );
		
		System.out.println(names);
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("ali", 23);
		hashMap.put("bella", 24);
		hashMap.put("charles", 25);

		names.addAll(hashMap.keySet());
		
		System.out.println(names);

		List<List<Integer>> arrayIntergers = new ArrayList<>();
		
		arrayIntergers.add(Arrays.asList(1,2,3));
		
		ArrayList<Object> arrayList = new ArrayList<>();
		
		arrayList.add("String");
		arrayList.add(1);
		
		System.out.println(arrayList);
		
	}
}
