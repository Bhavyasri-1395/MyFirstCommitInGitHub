package HackerRank.Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
    	int[] tempArray = new int[d];
    	int count=0;
    	for(int i=d;i< expenditure.length;i++) {
    		for(int j=i-d,m=0;m<d &&j<expenditure.length;j++,m++) {
    			tempArray[m] = expenditure[j];
    		}
    		Arrays.sort(tempArray);
    		double median = expenditure[d];
    		if(d%2 != 0) {
    			median = tempArray[d/2];
    		}else {
    			median = (tempArray[(d-1)/2]+tempArray[d/2])/2 + 0.5;
    		}
    		if(expenditure[i]>=2*median) {
    			count++;
    		}
    	}
		return count;
    }

    public static void main(String[] args) throws IOException {

        int d = 4;
        int[] expenditure = {1, 2, 3, 4, 4};
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
    }
}
