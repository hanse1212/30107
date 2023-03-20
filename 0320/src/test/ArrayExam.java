package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayExam {

	public static void main(String[] args) {
		String[] array = {"one", "two"};
		
		for(String a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add(1, "1");
		
		al.remove(3);
		al.remove("1");
		
		for(String a: al) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		
		
		for(int a: list) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		Collections.sort(list); // 오름차순
		for(int a: list) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		Collections.reverse(list); // 내림차순
		for(int a: list) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "White", "Green", "Red"));
		colors.set(3, "blue");
		
		for(String a: colors) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("값 검색(contains): " + colors.contains("Red"));
		System.out.println("값 검색(indexOf): " + colors.indexOf("White"));
		
		colors.clear();
		for(String a: colors) {
			System.out.print(a + " ");
		}
		System.out.println();
		
//		ArrayList<Stu> student = new ArrayList<>();
	}

}

class Stu{
	String name;
	String phone;
	int age;
}
