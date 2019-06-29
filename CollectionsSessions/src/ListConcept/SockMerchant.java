package ListConcept;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int tempArray[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j] = temp;
				}
			}
		}
//		int i=0,j=i+1;
//		while(i<n) {
//			int count=1;
//			for(j=i+1;j<n;j++) {
//				if(ar[i]==ar[j]) {
//					count++;
//				}else {
//					break;
//				}
//				tempArray[i] = count;
//			}
//			i=j;
//		}
//		int result=0;
//		for(int m=0;m<tempArray.length;m++) {
//			result =result+(tempArray[m]/2);
//		}
//		return result;
		
		int count=0;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                count=count+1;
                i=i+1;
            }
        }
       // return count;
        
        // USING HASHSET
        
        HashSet<Integer> set = new HashSet<Integer>();
        int hashSetcount = 0;
        for(int i=0;i<n;i++) {
        	int element = ar[i];
        	if(set.contains(element)) {
        		hashSetcount++;
        		set.remove(element);
        	}else {
        		set.add(element);
        	}
        }
        return hashSetcount;
	}

	private static boolean alreadycalculate(int[] ar, int n) {
		// TODO Auto-generated method stub
		return false;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		System.out.println();
		System.out.println("result : " +result);

		//        bufferedWriter.write(String.valueOf(result));
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();

		scanner.close();
	}
}

