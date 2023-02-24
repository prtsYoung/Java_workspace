package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kor = sc.nextInt();
		double eng = sc.nextInt();
		double math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3;
		if(avg >= 90) {
			System.out.println("당신의 학점은 A 입니다."); 
			if(avg >= 95) { 
				System.out.println("당신의 학점은 A+ 입니다.");
			}
		} else if (avg >= 80) {
			System.out.println("당신의 학점은 B 입니다.");
		} else if (avg >= 70) {
			System.out.println("당신의 학점은 C 입니다.");
		} else if(avg >= 60) {
			System.out.println("당신의 학점은 D 입니다.");
		} else {
			System.out.println("당신의 학점은 F 입니다.");
		}
		
		System.out.printf("평균점수 : %.1f",avg);
		
	}
}
