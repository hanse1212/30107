package test;

import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle c = new Circle();
		
		System.out.print("반지름의 길이 : ");
		int r = input.nextInt();
		
		c.area(r);
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + c.getRadius());
		
		input.close();
	}

}

class Circle{
	
	private int radius = 0;
	private final double PI = 3.1415926535897932;
	public void area(int r) {
		radius = (int)(PI * (double)r * (double)r);
	}
	
	public int getRadius() {
		return radius;
	}
	
}