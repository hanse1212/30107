package test;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보!!");
		int game = (int)(Math.random()*3);
		String[] a = {"가위", "바위", "보"};
		String my = sc.next();
		System.out.println(a[game]);
		
		if(my.equals(a[game])) {
			System.out.println("비겼습니다");
		} else if(my.equals(a[game]) == false) {
			 if((my.equals("가위") && a[game].equals("보")) || (my.equals("바위") && a[game].equals("가위")) || (my.equals("보") && a[game].equals("바위")))
				 System.out.println("이겼습니다");
			 else if((my.equals("가위") && a[game].equals("바위")) || (my.equals("바위") && a[game].equals("보")) || (my.equals("보") && a[game].equals("가위")))
				 System.out.println("졌습니다");
		} else {
			System.out.println("오류 발생");
		}
		
		sc.close();
	}

}
