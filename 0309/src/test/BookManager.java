package test;

import java.util.Scanner;

public class BookManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book b1 = new Book("이것이 자바다", "신용권", "100");
		Book b2 = new Book("정보 보안 개론", "양대일", "200");
		Book b3 = new Book("모의해킹이란 무엇인가", "조정원", "300");
		Book b4 = new Book("인생의 태도", "웨인 다이어", "400");
		
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.nextLine();
		System.out.println(name + "님 안녕하세요");
		System.out.println("현재 대여 가능한 책은 " + Book.bookCount + "권 입니다");
		
		b1.rental();
		b2.rental();
		b3.rental();
		b4.rental();
		
		b1.back();
		b3.back();
		
		b2.check();
		b3.check();
		
		System.out.println("현재 대여 가능한 책은 " + Book.bookCount + "권 입니다");
		sc.close();
	}
	
	static class Book {
		String title, writer, number;
		static int bookCount;
		boolean pos = true;
		
		public Book() {bookCount++;}
		public Book(String title, String writer, String number) {
			this.title = title;
			this.writer = writer;
			this.number = number;
			bookCount++;
		}
		
		public void rental() {
			bookCount--;
			if(pos) {
				System.out.println(number + "번 대여 완료");
				pos = false;
			}
		}
		
		public void back() {
			bookCount++;
			if(pos == false) {
				System.out.println(number + "번 반납 완료");
				pos = true;
			}
		}
		
		public void check() {
			if(pos) {
				System.out.println(title + "은(는) 대여 가능합니다");
			} else if(pos == false) {
				System.out.println(title + "은(는) 이미 대여중입니다");
			}
		}
		
	}

}
