package HackerRank.StringManipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	
    	char[] charArrayA = a.toCharArray();
    	char[] charArrayB = b.toCharArray();
    	Arrays.sort(charArrayA);
    	Arrays.sort(charArrayB);
    	String sortedStringA = new String(charArrayA);
    	String sortedStringB = new String(charArrayB);
    	System.out.println(sortedStringA);
    	System.out.println(sortedStringB);
    	for(int i=0;i<a.length();i++) {
//    		if(b.contains(a.charAt(i)){
//    			b.
//    		}
    		
    		
    	}
//    	for(int i=1;i<a.length();i++) {
//    		int numberOfexchanges =0;
//    		for(int j=0;j<a.length()-i;j++) {
//    			if(a.charAt(j)>a.charAt(j+11)) {
//    				char temp = a.charAt(j);
//    				a.charAt(j) = a.charAt(j+1);
//    			}
//    			
//    		}
//    	}
//    	
    	
		return 0;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = "cba";

        String b = "dcb";

        int res = makeAnagram(a, b);

        System.out.println(res);
        //scanner.close();
    }
}
