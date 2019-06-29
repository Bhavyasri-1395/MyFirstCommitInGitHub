package ListConcept;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String: ");
//		//char charArray[] = new char[];
//		String str = sc.next();
//		if(str.charAt(0) == Integer.parseInt(str.charAt(0), 2)) {
//			System.out.print("ghfgkns");
		String str = "ch3ab3";
		//char str1[5]="Hello";
		char array[]=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			array[i] = str.charAt(i);
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(array[i]);
		}
		for(int i=0;i<str.length();i++) {
			if(array[i]>'A') {
				
			}
		}
//		array[0]=str.charAt(0);
//		System.out.print(array[0]);	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter range of the string: ");
//		int n = sc.nextInt();
//		for(int i=0;i<n;i++) {
//			array[i] = String.sc.next();
//			sc.next
//		}
//		
	}
}
