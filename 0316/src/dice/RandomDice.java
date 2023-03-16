package dice;

import java.util.Scanner;

public class RandomDice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diceSum = 0;
		
		System.out.print("주사위 던질 횟수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int rand = (int)(Math.random()*6)+1;
			System.out.println(i + "번째 숫자는 " + rand + "입니다");
			diceSum += rand;
		}
		System.out.println("주사위를 " + num + "번 던진 결과, 총 합은 " + diceSum + "입니다");
		
		sc.close();
	}

}
