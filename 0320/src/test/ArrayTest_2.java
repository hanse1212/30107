package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("별명을 입력해 주세요");
			name.add(sc.next());
		}
		
		String max = "";
		for(String n : name) {
			if(max.length()<n.length())
				max = n;
		}
		
		System.out.println("가장 긴 별명은 " + max);
		
		sc.close();
	}

}
