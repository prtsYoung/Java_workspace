package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		/*
		 #변수
		  1.데이터가 저장되는 공간에 이름을 붙여놓은 것 
		  2.변수는 생성할때 변수에 저장되는 데이터의 크기와 모양에 따라 적당한 데이터타입을 선언해야 한다.
		  ex) int : 4바이트 정수, String : 문자열, 
		  3.변수는 동일한 이름으로 중복선언 불가
		  4.변수 내부의 값은 언제든지 변경가능
		 */
		//변수의 선언 : 자료형(데이터타입) 변수명;
		int age;
		//변수의 초기화 : 변수명 = 값;
		age = 25;
		System.out.println(age);
		
		int score = 100;
		System.out.println(score);
		
		int myScore = score-20;
		System.out.println(myScore);
		
		String str = "한글";
		System.out.println(str);
		
		//선언 및 초기화하지 않은 변수는 사용불가
		
		
		
		
		
		
	}

}
