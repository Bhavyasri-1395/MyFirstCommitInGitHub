package HackerRank.Sorting;

import java.util.Scanner;

public class BubbleSort {

	// Complete the countSwaps function below.
	static void countSwaps(int[] a) {
		int numberOfExchanges = 0;
		for(int i=1;i<a.length;i++) {
			int check = 0;
			for(int j = 0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					numberOfExchanges++;
					check++;
				}
			}
			if(check == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in "+numberOfExchanges+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[a.length-1]);
	}

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4,6,7};
		countSwaps(arr);
	}
}

