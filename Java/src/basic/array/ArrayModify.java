package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {
	public static void main(String[] args) {
		
		String[] foods = {"삽겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] ="치킨"; //0번 인덱스의 값을 변경한다. 
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		//배열의 인덱스 탐색법
		System.out.println("-------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요 : ");
		String name = sc.next();
		
		boolean flag = true; //false가 기본값
		
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색완료!");
				System.out.println("인덱스 : " + i); 
				flag = false;
				break;
				
					} 
			
	}	if(!flag) {System.out.println("찾았읍니다."); } else {
		System.out.println("못찾았읍니다.");
	}
		
		//if(i ==foods.length){sout("없는 음식입니다. ")}
		sc.close();
} }
