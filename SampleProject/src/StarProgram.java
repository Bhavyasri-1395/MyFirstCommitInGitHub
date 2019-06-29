import java.util.Scanner;

public class StarProgram {

	public static void main(String[] args) {
        int n = 3;
        for(int i=0;i<n;i++) {
           for(int j=i;j<n-1;j++) {
        	   System.out.print(" ");
           }
           for(int k=1;k<=(2*i)+1;k++) {
        	   if(k%2==0) {
        		   System.out.print(" ");
        	   }else {
        		   System.out.print("*");
        	   }
           }
           System.out.println();
        }
	}
}
