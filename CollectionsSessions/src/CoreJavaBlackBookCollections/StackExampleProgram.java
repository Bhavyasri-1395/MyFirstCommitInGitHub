package CoreJavaBlackBookCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackExampleProgram {

	public static void main(String[] args) throws IOException{
        Stack<Integer> st = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0,element;
        
        while(choice<4) {
        	System.out.println("Select the operation that need to be perform: ");
            System.out.println("1 : Push opeartion");
            System.out.println("2 : Pop operation");
            System.out.println("3 : Search operation");
            System.out.println("4 : Exit");
            
            System.out.println("Your choice: ");
            choice = Integer.parseInt(br.readLine());
        	 switch(choice) {
        	 case 1: System.out.println("Enter the element that to be pushed: ");
        	         element = Integer.parseInt(br.readLine());
        	         st.push(element);
        	         break;
        	 case 2: element = st.pop();
             		 System.out.println("Popped out element is : " + element);
             		 break;
        	 case 3: System.out.println("Enter the element that to be searched :");		
        	         element = Integer.parseInt(br.readLine());
        	         int elementExists = st.search(element);
        	         if(elementExists == -1) {
        	        	 System.out.println("Element not found.");
        	         }else {
        	        	 System.out.println("Element is found in the position:"+elementExists);
        	         }
        	         break;
        	 default : System.out.println("Exit the opeartion.");
        	           return;        
        	 }
        	 System.out.println("Elements in the stack are: " +st);
        }
       
	}
}
