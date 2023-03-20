package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력해 주세요");
			name.add(sc.next());
		}
		int num = 0;
		for(String n : name) {
			if(n.startsWith("김")) {
				System.out.print("[" + n + "] ");
				num++;
			}
		}
		System.out.println();
		
		System.out.println("김씨 성을 가진 분은 모두 " + num + "명 입니다.");
		
		sc.close();
	}

}
