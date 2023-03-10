package test;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int a,b = 0;
		int sum = 0;
		System.out.print("첫번째: ");
		a = scan.nextInt();
		System.out.print("두번째: ");
		b = scan.nextInt();
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(a +"부터 "+b+"까지 "+ sum);
	}
}
