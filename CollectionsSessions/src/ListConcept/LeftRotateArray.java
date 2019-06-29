package ListConcept;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the range of elements: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i] =  sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        if(k>n) {
       	 k=k%n;
        }
        leftRotateArray(array,n,k);
		//printArrayElements(array,n);
	}

	private static void printArrayElements(int[] array, int n) {
        for(int i=0;i<n;i++) {
        	System.out.println(array[i]+" ");
        }
	}

	private static void leftRotateArray(int[] array, int n, int k) {
         int array1[] = new int[n];
         int array2[] = new int[n];
         for(int i=0;i<k;i++) {
        	 array1[i]=array[i];
         }
         for(int j=k,m=0;j<n;j++,m++) {
        	 array2[m]=array[j];
         }
         for(int i=n-k,m=0;i<n;i++,m++) {
        	 array2[i] = array1[m];
         }
         printArrayElements(array2,n);
	}
}
