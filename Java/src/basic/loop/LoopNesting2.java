package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int input = sc.nextInt();
		int count=0; //소수의 개수를 세 줄 변수.

		System.out.print("소수는 ? :");
		for(int i=1; i<=input; i++) {
			int cnt = 0; //소수 판별을 위해 나누어 떨어진 횟수(약수의 개수를 세 줄 변수)를 세어줄 변수.
			
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			} //입력받은 값까지 하나씩 올라가는 k가 소수인지 아닌지를 판단하는 로직.
			
			if(cnt == 2) {
				System.out.print(i + " ");
				count++;
			}

		} sc.close();
	
	}

}


