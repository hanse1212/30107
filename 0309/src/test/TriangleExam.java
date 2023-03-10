package test;

public class TriangleExam {

	public static void main(String[] args) {
		Triangle t = new Triangle(10.2, 17.3);
		
		t.triangleCal();
		
		t.setWidth(7.5);
		t.setHeight(9.2);
		
		t.triangleCal();
	}

}

class Triangle{
	private double width;
	private double height;
	
	public Triangle() {}
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void triangleCal() {
		System.out.println("가로가 " + width + "고 세로가 " + height + "인 삼각형의 넓이는 " + (int)(width*height/2));
	}
	
}