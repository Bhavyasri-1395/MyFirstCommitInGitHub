package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long lengthOfString = s.length();
		long count = 0,result =0;
		long q=1,r=0;
		if(n>=lengthOfString) {
			q = n/lengthOfString;
			r = n%lengthOfString;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a') {
					count++;
				}
			}
			result = count * q;
		}else if(n<lengthOfString){
			r = n;
		}
		if(r>0) {
			for(int i=0;i<r;i++) {
				if(s.charAt(i) == 'a') {
					result++;
				}
			}
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		System.out.println(result);

		//        bufferedWriter.write(String.valueOf(result));
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();

		scanner.close();
	}
}

