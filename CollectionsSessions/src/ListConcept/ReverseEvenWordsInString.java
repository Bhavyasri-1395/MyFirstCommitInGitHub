package ListConcept;

import java.util.Scanner;

public class ReverseEvenWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseEvenWordsInString(str.trim());
	}

	private static void reverseEvenWordsInString(String str) {
		int flag = 1;
		for(int i=0;i<str.length();i++) {
			int initialIndex = i;
			int lastIndex = i;
			while(i<str.length() && str.charAt(i)!=' ') {
				lastIndex = i;
				i++;
			}
			if(flag==1) {
				printString(str,initialIndex,lastIndex,flag);
				flag = 0;
			}else {
				printString(str, initialIndex, lastIndex,flag);
				flag = 1;
			}
		}
	}

	private static void printString(String str, int initialIndex, int lastIndex,int flag) {
		if(flag == 0) {
			for(int i=lastIndex;i>=initialIndex;i--) {
				System.out.print(str.charAt(i));
			}	
		}else {
			for(int i=initialIndex;i<=lastIndex;i++) {
				System.out.print(str.charAt(i));
			}
		}
		if(lastIndex!=str.length()-1) {
			System.out.print(' ');			
		}
	}
}
