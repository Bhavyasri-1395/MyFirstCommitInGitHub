package CoreJavaBlackBookCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsageTelusko {

	public static void main(String args[]) {
		List<Integer> values = new ArrayList<>();
		values.add(132);
		values.add(101);
		values.add(745);
		values.add(340);
		values.add(646);
		
		//Method 1
		System.out.println("Method 1");
		Comparator<Integer> obj1 = new ComparatorImpl();
		Collections.sort(values, obj1);
		
		//Method 2
		System.out.println("Method 2");
		Comparator<Integer> obj2 = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if(o1%10>o2%10) {
					return 1;
				}
				return -1;
			}
		};
		Collections.sort(values, obj2);
		
		//Method 3
		System.out.println("Method 3");
		Collections.sort(values,(o1,o2) -> {
			return o1%10>o2%10?1:-1;
		});
		for(int i:values) {
			System.out.println(i);
		}
	}
}
class ComparatorImplI implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10>o2%10) {
			return 1;
		}
		return -1;
	}
}