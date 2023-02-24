package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {
	public static void main(String[] args) {
		//구구단 단수를 입력받아 구구단 출력 4 -> 4단전부
		System.out.println("단수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		int y =1;
		System.out.println("*****"+x + "단" + "*****");
		
		while (y<=9) {
			System.out.println(x + "X" + y + "=" + (x*y));
			y++;
		}
	
	}
}
