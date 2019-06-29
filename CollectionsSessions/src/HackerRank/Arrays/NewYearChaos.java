package HackerRank.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int sizeOfArray = q.length;
		int numberOfExchanges=0;
		for(int i=0;i<sizeOfArray;i++) {
			if(q[i]-(i+1) > 2) {
				System.out.println("Too chaotic");
				return;
			}
		}
		for(int i=1;i<sizeOfArray;i++) {
			int check = 0;
			for(int j=0;j<sizeOfArray-i;j++) {
				if(q[j]>q[j+1]) {
					int temp = q[j];
					q[j] = q[j+1];
					q[j+1] = temp;
					check++;
					numberOfExchanges++;
				}
			}
			if(check == 0) {
				break;
			}
		}
		System.out.println(numberOfExchanges);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}

