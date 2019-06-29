package ListConcept;

import java.util.Scanner;

public class RepeatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
        StringBuilder str= new StringBuilder(s);
        StringBuilder str1= new StringBuilder();
        int q=0,r=0;
        int lengthOfGivenString = str.length();
        if(lengthOfGivenString<n) {
        	q = n/lengthOfGivenString;
        	r = n%lengthOfGivenString;
        }
        if(q>0) {
        	for(int i=0;i<q;i++) {
               str1.append(str);
        	}
        }  
        if(r>0) {
        	for(int i=0;i<r;i++) {
        		str1.append(str.charAt(i));
        	}
        }
        System.out.println(str1);
        RepeatedAlphabet(str1,n);
	}
	private static void RepeatedAlphabet(StringBuilder str1, int n) {
		int count = 0;
		for(int i=0;i<n;i++) {
			 if(str1.charAt(i)=='a') {
				 count++;
			 }
		}
		System.out.println(count);
	}

//	private static int lengthOfTheGivenString(StringBuilder str) {
//		int count = 0;
//		for(int i=0;str.charAt(i)!='\0';i++) {
//			count++;
//		}
//		return count;
//	}
}
