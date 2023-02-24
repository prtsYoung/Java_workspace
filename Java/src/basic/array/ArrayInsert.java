package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String[] names = new String[6];
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
			/*
			 -자바에서는 문자열 동등비교시 "=="를 사용하면 제대로 비교가 되지 않는다.
			 -문자열 String이 기본데이터 타입이 아닌 객체 참조 타입이기 때문이다.
			 객체 참조 타입은 해당값을 직접 들고 있는 것이 아니라 객체의 주소값을 들고 있기 때문에
			 문자열이 아무리 같더라도 주소가 다르면 false를 도출한다. 
			 -그러므로 문자열 동등 비교를 진행할 때는 
			 [비교문자열1.equals(비교문자열2)]를 사용하여 진행해야 한다. 
			 */
			
			if(name.equals("그만")) { //문자열의 비교는 ==을 쓸수 없다. [.equals]매소드를 이용해 비교한다.
				System.out.println("입력을 종료합니다.");
				break;
			}
			names[i] =name;
		}
		System.out.println("----------------------------------------------");
		System.out.println("입력받은 이름 : ");
		for(String name :names) {
			if(name == null) break; //널이 안보이게 하기 위한 식//널은 키워드기 때문에 ==으로 비교해도 된다.
			System.out.print(name + " ");
		
		}
		
		sc.close();
		
	}
}
