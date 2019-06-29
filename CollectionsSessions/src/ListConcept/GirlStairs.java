package ListConcept;

import java.util.Scanner;

public class GirlStairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 2;
		int b = 3;
		if(n<4) {
			System.out.println("No of posible Cases: "+n);
		}else {
			int temp = 0;
			for (int i = 4; i <= n; i++) {
				temp = b;
				b = a+b;
				a = temp;
			}
			System.out.println("No of posible Cases: "+b);
		}
		recurtion(n,"",0);
		sc.close();
	}

	private static void recurtion(int n, String sequence, int sum) {
		if(sum == n) {
			System.out.println(sequence);
		}else if(sum<n) {
			recurtion(n, sequence+"1", sum+1);
			recurtion(n, sequence+"2", sum+2);
		}
	}
}