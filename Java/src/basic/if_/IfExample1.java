package basic.if_;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		System.out.println("내 점수 : " + point + "점");
		System.out.println("-------------------------------");
		
		if(point >= 70){
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격임");
		}
		System.out.println("시험 치르느라 수고했습니다.");
		
		sc.close();
	}

}
