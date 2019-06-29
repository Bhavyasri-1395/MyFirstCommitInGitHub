package HackerRank.Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeSortCountingInversions {

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        int result=0;
    	for(int i=1;i<arr.length;i++) {
    		int exch=0;
    		for(int j=0;j<arr.length-i;j++){
    			if(arr[j]>arr[j+1]) {
    				int temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    				exch++;
    				result++;
    			}
    		}
    		if(exch == 0) {
    			break;
    		}
    	}
		return result;
    }

    public static void main(String[] args) throws IOException {
            int n = 5;
            int[] arr = {2, 1, 3, 1, 2};
            long result = countInversions(arr);
            System.out.println(result);
    }
}

