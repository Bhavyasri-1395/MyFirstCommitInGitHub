package ListConcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InceasingDecreasingArray {

	public static void main(String[] args) throws IOException{
		InceasingDecreasingArray inDecArray = new InceasingDecreasingArray();
		System.out.println("Enter the size of array:");
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int array[] =  new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter integer: ");
			array[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Array before sorting: ");
		inDecArray.printArray(array,n);
        inDecArray.sortedArray(array,n);
        System.out.println();
        System.out.println("Array after sorting: ");
        inDecArray.printArray(array,n);
        System.out.println();
        System.out.println("Expected answer: ");
        inDecArray.expectedAnswer(array, n);
	}

	private void expectedAnswer(int[] array, int n) {
		int currentElement = 0, lastElement = n-1;
		int i,j,k = 2, flag = 0, DecCount,AscCount ;
		while(currentElement<=lastElement) {
			if(flag == 0) {
				for(i = currentElement,AscCount = 0; AscCount < k && i <= lastElement ;i++) {
		        	System.out.print(array[i]+" ");
		        	AscCount++;
		        }
				currentElement = i;
				flag = 1;
			}else {
				 for(j = lastElement, DecCount =0 ; DecCount < k && j >= currentElement;j--) {
					 System.out.print(array[j]+" ");
					 DecCount++;
				 }
				 lastElement = j;
				 flag = 0;
			}
			k++;
		}
        
	}

	private void printArray(int[] array, int n) {
		for(int i= 0; i < n ; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private void sortedArray(int[] array, int n) {
	   int min;
       for(int i = 0; i < n-1; i++) {
    	   min = i;
    	   for(int j= i+1;j<n;j++) {
    		   if(array[j]<array[min]) {
    			   min = j;
    		   }
    	   }
    	   if(min != i) {
    		   int temp = array[i];
    		   array[i] = array[min];
    		   array[min] = temp;
    	   }
       }
	}
	
	
}
