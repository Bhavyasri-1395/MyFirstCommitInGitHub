package ListConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringRelatedPrograms {

	public static void main(String args[]) {
//		String var ="j";
//		Scanner sc = new Scanner(System.in);
//		String string = sc.next();
//		System.out.println(string.matches("[a-b]{1}"));
//		System.out.println(var.length());
//		int n=67;
//		String str = String.valueOf(n);		
//		System.out.println(str.length());
        StringTokenizer t = new StringTokenizer("bhavyasrb srb"," ");
        String s = t.nextToken();
        String s1 = s ;
        while(t.hasMoreTokens())
        {
                        s1 = t.nextToken();
        }
        if(s.charAt(0) == s1.charAt(s1.length()-1))
        	System.out.println("true");
        else
        	System.out.println("false");

        
        Collection values = new ArrayList();
        values.add("shdgasd");
        values.add(1);
        values.add('1');
        values.add(19.03739);
        
        
	}
}
