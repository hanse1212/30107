package test;

import java.util.Scanner;

public class EqualExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s1 = "hi";
		String s2 = sc.next();
		
		if(s1.equals(s2))
			System.out.println("일치합니다");
		else
			System.out.println("일치하지 않습니다");
		
		sc.close();
	}

}
