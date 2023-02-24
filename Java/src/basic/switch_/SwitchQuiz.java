package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("연산을 선택하세요 [+, -, *, /] : ");
		String pm = sc.next();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
//		int result=0;
//		boolean flag = false;
		
//		switch(pm) {
//		case "+" : 
//			result = num1 + num2;
//			break;
//		case "-" : 
//			result = num1 - num2;
//			break;
//		case "*" : 
//			result = num1 * num2;
//			break;
//		case "/" : 
//			if(num2 == 0) {
//				System.out.println("0으로 나누면 안돼요");}
//			flag =true;
//			result = num1 / num2;
//			break;
//		default :
//			System.out.println("연산자를 똑바로 입력하세요");
//			flag = true;	
//			break;
//				
//		}
//		if (flag==false)//(!flag) {
//			System.out.printf("%d %s %d = %d\n",num1,pm,num2,result);
//			flag =true;
		// }
//		
		
		
		switch(pm) {
		case "+" : 
			System.out.println(num1 + num2);
			break;
		case "-" :
			System.out.println(num1 - num2);
			break;
		case "*" :
			System.out.println(num1 * num2);
			break;
		case "/" :
			if(num2 == 0) {
				System.out.println("0으로 나누면 안돼요");}
			else{System.out.println(num1 / num2);
			} 
			
			break;
		default :
			System.out.println("연산자를 똑바로 입력하세요");
				break;
		}
		
		sc.close();
		
	}
}
