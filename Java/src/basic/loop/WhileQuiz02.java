package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
public static void main(String[] args) {
	//약수의 총합
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요");
	int x = sc.nextInt();
	int y =1; //약수구하는애 begin
	int total=0; //누적합을 담아줄 변수
	while(y<=x) {
		if(x % y ==0) {
			total+=y; //누적합 구해주는 식 //갯수를 새주는 식은 count++
		}
		y++;
	} System.out.println("약수의 총합 : " + total);
	sc.close();
}
}
