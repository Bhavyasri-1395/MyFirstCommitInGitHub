package ListConcept;

import java.util.Scanner;

public class RhombusStarProgramTwo {

	public static void main(String[] args) {
		int i,j,k;
		System.out.println("Number of Rows:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(i = 1;i<= n;i++) {
			for(j = i ; j < n; j++) {
				System.out.print(" ");
			}
			for(k = 1; k <= i; k++) {
				if(k == i) {
					System.out.print("*");
				}else {
					System.out.print("* ");        		   
				}
			}
			System.out.println();
		}
	}
}
