package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));
		System.out.print("삭제를 원하는 친구를 입력하세요 : ");
		String name = sc.next();
		
		//삭제할 친구들 입력받아서 삭제를 진행해주세요
		//입력받은 이름이 없다면 없는 친구라고 얘기해주세요.
//		boolean flag =false;
//		; 
//		
//		for(int i =0 ; i<kakao.length -1; i++ ) {
//			if(name.equals(kakao[i])) {kakao[i] = kakao[i+1];
//			flag = false;}
//			else if(!(name.equals(kakao[i]))) {
//				flag = true;
//			}}
//			
//			String[] temp = new String[kakao.length-1];
//			for(int j = 0; j< temp.length; j++) {
//				kakao[j]= temp[j];
//				flag = false;
//			}
//			
//			
//		
//		if(flag) {
//			System.out.println("배열 내부에 이름이 없어요.");
//		} else{ System.out.println("잘했다");}
//		
//		System.out.println(Arrays.toString(kakao));
//		System.out.println(Arrays.toString(temp));
		boolean  flag = false;
		
		for(int i = 0; i< kakao.length; i++) {
			if(name.equals(kakao[i])) {
				flag = true;
				for(int j=i; j< kakao.length-1; j++) {
					kakao[j] = kakao[j+1];
				}
				break;
			}
		}
		if(!flag) {
			System.out.println(name + "은 없는 이름입니다.");
		}else{System.out.println(Arrays.toString(kakao));
			
		}
			
		String[] temp = new String[kakao.length-1];
		for(int i= 0; i < temp.length; i++) {
			temp[i]= kakao[i];
		}
		System.out.println(Arrays.toString(temp));
		kakao = temp;
		temp = null;
		
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(kakao));
		
		sc.close();
		
	}
	
	
}
