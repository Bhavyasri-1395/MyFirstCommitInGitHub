package ListConcept;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		 System.out.println("Enter number of rows:");
		 Scanner sc = new Scanner(System.in);
		 int numberOfRows = sc.nextInt();
		 int array[][] = new int[numberOfRows][numberOfRows];
		 sc.close();
		 for(int line = 0; line < numberOfRows; line++) {
			 for(int i=0;i<=line;i++) {
				 if(line==i || i==0) {
					 array[line][i]= 1;
				 }
				 else {
					 array[line][i] = array[line-1][i-1] + array[line-1][i];
				 }
				 System.out.print(array[line][i]);
			 }
			 System.out.println();
		 }
	}
}