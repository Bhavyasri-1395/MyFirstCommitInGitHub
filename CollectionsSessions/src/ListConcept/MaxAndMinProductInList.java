package ListConcept;

import java.util.Scanner;

public class MaxAndMinProductInList {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Number of elements going to execute:");
	     int numberOfElements = sc.nextInt();
	     int array[] = new int[numberOfElements];
	     int sum = 1;
	     int min = 0;
	     int max=0;
	     int maxNeg = 0;
	     int minPos = 0;
	     for(int i=0;i<numberOfElements;i++) {
	    	 array[i]= sc.nextInt();
	    	 if(array[i]!=0) {
	    		 sum *=array[i];
	    		 if(array[i] < 0) {
	    			 maxNeg = maxNeg != 0? maxNeg > array[i] ? maxNeg : array[i] : array[i];
	    		 } else {
	    			 minPos = minPos != 0? minPos < array[i] ? minPos : array[i] : array[i];
	    		 }
	    	 }
	     }
	     max = sum;
	     min = sum;
	     if(sum > 0) {
	    	 if(maxNeg != 0) {
	    		 min = sum/maxNeg;
	    	 }else if(minPos != 0){
	    		 min = sum/minPos;
	    	 }
	     }else {
	    	 if(maxNeg != 0) {
	    		 max = sum / maxNeg;
	    	 }else if(minPos != 0) {
	    		 max = sum /minPos;
	    	 }
	     }
	     System.out.println("Min Value:"+min);
	     System.out.println("Max Value:"+max);
	     sc.close();
	}

}
