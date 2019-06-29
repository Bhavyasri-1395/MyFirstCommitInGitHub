package HackerRank.Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarkAndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
    	int sum = 0,count=0 ;
    	for(int i=0;i<prices.length;i++) {
    		int min = i;
    		for(int j= i+1;j<prices.length;j++) {
    			if(prices[j]<prices[min]) {
    				min =j;
    			}
    		}
    		sum = sum + prices[min];
    		if(min != i) {
    			int temp = prices[i];
    			prices[i] = prices[min];
    			prices[min] = temp;
    		}
    		if(sum <= k) {
    			count++;
    		}else {
    			break;
    		}
    	}
		return count;
    }

    public static void main(String[] args) throws IOException {
        int k = 50;
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int result = maximumToys(prices, k);
        System.out.println(result);
    }
}

