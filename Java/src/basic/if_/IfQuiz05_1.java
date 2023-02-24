package basic.if_;

import java.util.Scanner;

public class IfQuiz05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("수학 : ");
		double eng = sc.nextDouble();
		System.out.print("영어 : ");
		double math = sc.nextDouble();
		
		double avg = (kor + eng + math) / 3;
		String grade;
		
		if(avg >=90) {
			grade = "A0";
			if(avg >= 95) {
				grade = "A+";}
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade ="C";
			} else if(avg >= 60) {
				grade ="D";
			} else {
				grade ="F";
			}
			
			System.out.printf("평균점수 : %.1f\n",avg);
			System.out.println("당신의 학점은 " + grade + "입니다.");
			
			
			
			
			
			
		}
	
}
