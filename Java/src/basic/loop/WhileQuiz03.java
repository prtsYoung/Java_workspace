package basic.loop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WhileQuiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2  : ");
		int num2 = sc.nextInt();
//		if(num1 > num2) {
//			int temp =num1;
//			num1 =num2;
//			num2 = temp;
//		}
//		
//		int total =0;
//		int n = num1;
//	
//		while(n<=num2) {
//		total+=n; n++;	} 
//		System.out.printf("%d부터 %d 까지의 누적 합계 : %d", num1,num2,total);
//		sc.close();
//		}
		int start = (num1 > num2 ? num2 : num1);
		int end = (num1 > num2 ? num1 : num2);
		
		int total = 0;
		
		while(start <= end) {
			total += start;
			start++;}
		System.out.printf("%d부터 %d까지의 누적합계 : %d\n ",num1,num2,total);		}
	}
		
		
		
		
//x가 작은값 들어온다 생각하고 만들어보기		
		
		
		
		
		
		
		
	
