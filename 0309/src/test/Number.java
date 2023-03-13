package test;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int randNum = (int)(Math.random()*50+1);
		
		for(int i=1; i<=5; i++) {
			System.out.print("1~50까지 중 숫자 입력 : ");
			int num = sc.nextInt();
			if(num > randNum) 
				System.out.println("너무 큽니다 (" + i + "회)");
			else if(num < randNum)
				System.out.println("너무 작습니다(" + i + "회)");
			else if(num == randNum) {
				System.out.println("*** 축하합니다 ***");
				break;
			}
		}
		
		System.out.println("랜덤숫자는 " + randNum + "입니다!");
		
		sc.close();
	}

}
