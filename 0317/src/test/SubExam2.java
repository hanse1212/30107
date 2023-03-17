package test;

import java.util.Scanner;

public class SubExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next();
		
		System.out.println(s.substring(s.length()-3));
		
		sc.close();
	}

}
