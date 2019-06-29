package ListConcept;
import java.io.IOException;
import java.util.Scanner;
public class RhombusNumberProgram {

	public static void main(String[] args) throws IOException{
		int i,j,k,l;
          System.out.println("Number of rows:");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          sc.close();
          for (i = 1; i <= n; i++) {
        	  for(j= n; j > i;j--) {
        		  System.out.print(" ");
        	  }
        	  for(k = 1; k <= i; k++) {
        			  System.out.print(k);
        	  }
        	  for(l = i; l > 1;l--) {
        			  System.out.print(l-1);
        	  }
        	  System.out.println();
          }
	}
}
