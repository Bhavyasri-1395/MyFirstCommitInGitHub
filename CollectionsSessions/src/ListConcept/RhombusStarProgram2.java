package ListConcept;

import java.util.Scanner;

public class RhombusStarProgram2 {

	public static void main(String[] args) {
       int i,j,k,l;
       System.out.println("Number of Rows:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(i = 1;i<= n;i++) {
    	   for(j = i; j < n ; j++) {
    		   System.out.print(" ");
    	   }
    	   for(k = 1 ; k <= 2*i-1; k++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       for(i = 1; i<= n;i++) {
    	   for(j = 0; j < i; j++) {
    		   System.out.print(" ");
    	   }
    	   for(k = 1; k <= 2*(n-i)-1; k++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}
}
