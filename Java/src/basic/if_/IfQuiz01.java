package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {
	public static void main(String[] args) {
	//	키 140cm이상 나이가 8세 이상만 탑승 가능, 둘다 만족해야함, 탑승여부와 관계없이 문구출력
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		int height= sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(height >= 140 && age >= 8) {
			System.out.printf("키 : %dcm, 나이 : %d세\n",height,age );
			System.out.println("놀이기구 탑승이 가능합니다.");
		} else {
			System.out.printf("키 : %dcm, 나이 : %d세\n",height,age);
			System.out.println("탑승이 불가능합니다.");
		}
		System.out.println("오늘하루 즐거운 시간 되세요!");
		sc.close();
	}
}
