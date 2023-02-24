package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {
	public static void main(String[] args) {
		//2가지 정수 1~100까지 난수를 발생시켜 지속적으로 문제를 출제한 후 정답을 입력받기
		//사용자가 0을 입력하면 반복문 탈출시키기
		System.out.println("***연산 퀴즈***");
		
		int ok = 0;
		int no =0;
		
		while(true) {
			int x = (int) ((Math.random()*100) +1);
			int y = (int) ((Math.random()*100) +1);
			int opr = (int) (Math.random()*2);
			int correct;
			
			if(opr == 0) {
				System.out.printf("%d + %d = ???",x,y);
				correct = x + y;
			}else {
				System.out.printf("%d - %d = ???\n",x,y);
				correct = x - y;
			}
		Scanner sc = new Scanner(System.in);
			int aws = sc.nextInt();
			
			if(aws==correct) {
				System.out.println("정답입니다.");
				ok++;
			} else if(aws == 0) {
				System.out.println("종료합니다."); 
				break;
			} else {System.out.println("틀렸습니다.");
					no++;}

	
			}
		System.out.println("-----------------------------------------");
		
			System.out.println("정답 횟수 : " + ok);
			System.out.println("오답 횟수 : " + no);
			
			
		}
	}
