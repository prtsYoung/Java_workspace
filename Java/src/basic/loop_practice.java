package basic;

import java.util.Scanner;

public class loop_practice {
	 public static void main(String[] args) {
		
		 //양의 정수를 하나 입력받은후 , 그 수만큼 3의 배수를 출력하세요
		 //ex) 5입력시 3,6,9,12,15

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y =1;
		while(y <= x) {
			System.out.println(3*y);
			y++; 
			}
		}
	
}
