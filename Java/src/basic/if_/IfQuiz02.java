package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println(x + "이 큰 수 입니다.");
		} else if (y > x) {
			System.out.println(y + "이 큰 수 입니다.");
		} else {
			System.out.println("같은 수 입니다.");
		}
		sc.close();
	}
}
