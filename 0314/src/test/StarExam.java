package test;

import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("별의 개수 : ");
		int starNum = sc.nextInt();
		
		System.out.println("방향 : ");
		int dir = sc.nextInt();
		
		if(dir ==1) {
			for(int i=1; i<=starNum; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else {
			for(int i=starNum; i>=1; i--) {
				for(int j=0; j<i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		
		sc.close();
	}
}