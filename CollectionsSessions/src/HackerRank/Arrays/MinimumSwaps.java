package HackerRank.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.print.attribute.standard.NumberOfDocuments;

public class MinimumSwaps {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int NumberOfExchanges = 0;
		for(int i=0;i<arr.length;i++) {
			int min =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				 
				
				
				int temp =arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				NumberOfExchanges++;
			}
		}
		return NumberOfExchanges;
	}

	public static void main(String[] args) throws IOException {
		int[] arr = {1,3,5,2,4,6,7};
		int res = minimumSwaps(arr);
	}
}

