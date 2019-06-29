package ListConcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VenkatProgram {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the range of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		System.out.println("enter the element of operation: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Elements before sorting: ");
		printArrayElements(array,n);
		System.out.println();
		System.out.println("Elements after sorting: ");
		sortArrayElements(array,n);
		printArrayElements(array,n);
		System.out.println();
		System.out.println("Enter the value of k: ");
		int k = sc.nextInt();
		requiredOutput(array, k, n);
	}

	private static void requiredOutput(int[] array, int k, int n) {
		if(k<n) {
			for(int i=0;i<k;i++) {
				System.out.print(array[i]+" ");
			}
		}else {
			System.out.println("Value of k should be less than n.");
		}
	}

	private static void sortArrayElements(int[] array, int n) {
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(array[i]<array[j]) {
        			int temp =  array[i];
            		array[i] = array[j];
            		array[j]=temp;
        		}
        	}
        }
	}

	private static void printArrayElements(int[] array, int n) {
          for(int i=0;i<n;i++) {
        	  System.out.print(array[i]+" ");
          }
	}
}
