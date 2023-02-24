package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {
	public static void main(String[] args) {
		/*    # UP&DOWN 게임을 제작합니다.
         1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
         2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
         작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
         정답에 근접할 수 있도록 유도해 주세요.
         3. 승리 조건 횟수는 7회로 제한하겠습니다.
         7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
         정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
         */
		int chance=0;
	
		
		System.out.println("***up & down 게임 ***");
		int rn = (int) ((Math.random()*100) +1);
		
		
		while(true) {
			System.out.print(">");
			
			Scanner sc = new Scanner(System.in);
			int x  = sc.nextInt();
			chance++;
			
			if(x<1 || x>100) {
				System.out.println("범위 내의 숫자를 입력하세요!");
				continue; //아래부분싹 건너뛰고 다시 위부터시작
			}
			
			
			if(x==rn) {
			System.out.println("정답입니다~");
				break;
			}else if(x < rn){System.out.println("up!!!");
			if(chance<7) {
			System.out.println("남은 정답 기회 : " +(7-chance));
			}else if (chance<=0){System.out.println("기회를 모두 소진하였습니다.\n 마저 정답을 맞춰주세요");}
		
			}else if(x > rn) {System.out.println("down!!!");
			if(chance<7) {
			System.out.println("남은 정답 기회 : " + (7-chance));
			}else if(chance<=0) {System.out.println("기회를 모두 소진하였습니다.\n 마저 정답을 맞춰주세요");}
			} 
			System.out.println("정답은 : " + rn);}
			
		System.out.println( chance + "번 만에 맞추셨습니다.");
		if(chance <=7) {System.out.println("승리했습니다.");}else {
			System.out.println("패배했습니다.");
		}
		
		
		
		
	}
}
