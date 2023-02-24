package basic.begin;

import java.util.Scanner;

public class CelToFahr {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("섭씨 온도 : ");
	double cel = sc.nextDouble();
	System.out.printf("섭씨를 변환한 화씨 온도 : %.1f℉",(cel*1.8) +32); //원하는 소숫점자릿수
	//printf는 문장을 완전히 완성하고 난 뒤 그 후에 콤마 찍고 값을 줘야함
	//정수와 정수의 나눗셈 결과는 정수이다.(소수점 x) ex) int 10/4 =2
	
	sc.close();

	
}
}
