package ListConcept;

import java.util.Scanner;

public class RhombusStarProgram {

	public static void main(String[] args) {
       int i,j,k,l;
       System.out.println("Number of Rows:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(i = 1;i<= n;i++) {
    	   for(j = i; j <= n-1 ; j++) {
    		   System.out.print(" ");
    	   }
    	   for(k = i; k >= 1;k--) {
    		   System.out.print("*");
    	   }
    	   for(l = i; l > 1; l--) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       for(i = 2; i<= n;i++) {
    	   for(j = 1; j < i; j++) {
    		   System.out.print(" ");
    	   }
    	   for(k = n; k >= i ; k--) {
    		   System.out.print("*");
    	   }
    	   for(l = i; l < n; l++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}
}
