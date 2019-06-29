package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Integer> positiveArray=new ArrayList<Integer>();
		ArrayList<Integer> negativeArray=new ArrayList<Integer>();
		int resultValue;
		int negativeValue = 0;
		int positiveValue = 0;
		int array[]= {-7,-8,9,2,7,3,4};
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
				negativeArray.add(array[i]);
			}else {
				positiveArray.add(array[i]);
			}
		}
		if(negativeArray.size()==0 && positiveArray.size()==0) {
			System.out.println("List is empty");
		}else {
			if(positiveArray.size()!=0) {
				positiveValue = positiveArray.get(0);
				for(int i=1;i<positiveArray.size();i++) {
					if(positiveArray.get(i)<positiveValue) {
						positiveValue=positiveArray.get(i);
					}
				}
			}
			if(negativeArray.size()!=0) {
				negativeValue = negativeArray.get(0);
				for(int i=1;i<negativeArray.size();i++) {
					if(negativeArray.get(i)>negativeValue) {
						negativeValue=negativeArray.get(i);
					}
				}
			}
			if(positiveArray.size()==0) {
				resultValue = negativeValue;
			}else if(negativeArray.size()==0) {
				resultValue = positiveValue;
			}else {
				int fixNegativeValue = Math.abs(negativeValue);
				if(fixNegativeValue>=positiveValue) {
					resultValue = positiveValue;
				}else{
					resultValue = negativeValue;
				}
			}
			System.out.println(resultValue);
		}
	}       
}
