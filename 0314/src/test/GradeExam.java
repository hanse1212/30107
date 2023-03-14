package test;

import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] score = new int[3];
			
			System.out.println("수학, 과학, 영어 순으로 3과목의 점수 입력 >> ");
			for(int i=0; i<score.length; i++)
				score[i] = sc.nextInt();
			
			Grade me = new Grade(score[0], score[1], score[2]);
			
			System.out.println("과목 평균 점수는 " + me.average());
			
			sc.close();
		}
}

	class Grade{
		private int math, science, english;
		
		public Grade() {}
		public Grade(int math, int science, int english) {
			this.math = math;
			this.science = science;
			this.english = english;
		}

		public int average() {
			return Math.round(((math + science + english)/3));
		}
		
	}
