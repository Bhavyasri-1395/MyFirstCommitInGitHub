package ListConcept;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static double repeatedString(String s, long n) {
        StringBuilder str1= new StringBuilder();
        long q=0,r=0;
        long lengthOfGivenString = s.length();
        if(lengthOfGivenString<n) {
        	q = n/lengthOfGivenString;
        	r = n%lengthOfGivenString;
        }
        if(q>0) {
        	for(int i=0;i<q;i++) {
               str1.append(s);
        	}
        }  
        if(r>0) {
        	for(int i=0;i<r;i++) {
        		str1.append(s.charAt(i));
        	}
        }
        long count = 0L;
		for(int i=0;i<n;i++) {
			 if(str1.charAt(i)=='a') {
				 count++;
			 }
		}
		return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double result = repeatedString(s, n);
        
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
