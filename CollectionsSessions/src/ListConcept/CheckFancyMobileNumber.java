package ListConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckFancyMobileNumber {
	public static void main(String args[]) {
		CheckFancyMobileNumber checkFancyMobileNumber =  new CheckFancyMobileNumber();
		ArrayList<Integer> mobileNumber = new ArrayList<Integer>(); 
		mobileNumber.add(7);
		mobileNumber.add(7);
		mobileNumber.add(7);
		mobileNumber.add(8);
		mobileNumber.add(9);
		mobileNumber.add(7);
		mobileNumber.add(6);
		mobileNumber.add(5);
		mobileNumber.add(1);
		mobileNumber.add(0);
		Boolean result= checkFancyMobileNumber.isFancy(mobileNumber);
		if(result == true) {
			System.out.println("Yes, It is fancy number");
		}else {
			System.out.println("No, It is not a fancy number");
		}
	}		

	Boolean isFancy(ArrayList<Integer> mobileNumber) {
		if(condition1And2(mobileNumber) || condition3(mobileNumber)) {
			return true;
		}else{
			return false;
		}
	}

	private boolean condition3(ArrayList<Integer> mobileNumber) {
		int array[] = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<mobileNumber.size();i++) {
				int tempVar = mobileNumber.get(i);
				array[tempVar]++;
		}
		for(int j=0;j<array.length;j++) {
			if(array[j]>=4) {
				return true;
			}
		}
		return false;
	}

	private boolean condition1And2(ArrayList<Integer> mobileNumber) {
	    for(int i=1;i<mobileNumber.size()-1;i++) {
	    	if(mobileNumber.get(i-1)==mobileNumber.get(i)&& mobileNumber.get(i)==mobileNumber.get(i+1)) {
	    		return true;
	    	}else if((mobileNumber.get(i-1)==mobileNumber.get(i)-1&&mobileNumber.get(i)+1 == mobileNumber.get(i+1)) ||
	    			  (mobileNumber.get(i-1)==mobileNumber.get(i)+1&&mobileNumber.get(i)-1 == mobileNumber.get(i+1))) {
	    		return true;
	    	}
	    }
		return false;
	}
}
