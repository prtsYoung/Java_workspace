package basic;

import java.util.Scanner;
//art + 방향기 -> 코드를 위아래로 움직이고 싶을때 사용
//1. Scanner api 로딩 (제공되는 Scanner 정보를 현재 클래스로 가져오기)

public class ScannerExample {
 public static void main(String[] args) {
	//2.스캐너 객체 생성
	 Scanner sc = new Scanner(System.in);
	 
	 //3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있다.
	 /*-next() : 공백이 없는 문자열을 입력받는다.
	 -nextLine() : 공백을 포함한 문자를 입력받는다.
	 -next + 기본타입() : 해당 타입에 맞는 데이터를 입력받는다. */
	 
	 
	 String name = sc.next();
	 System.out.println("이름 : " + name);
	 
	 
	 int age = sc.nextInt();
	 System.out.println("제 이름은 " + name + "이고 " + "나이는 " + age + "입니다.");
	 System.out.printf("제이름은 %s이고 나이는 %d 입니다.",name,age);
	 //4. Scanner 객체를 반납
	 //객체를 반납 -> Scanner를 메모리에서 해제.
	 sc.close();
 		}
	}
