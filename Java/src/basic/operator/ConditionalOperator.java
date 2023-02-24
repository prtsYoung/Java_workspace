package basic.operator;

public class ConditionalOperator {
	//조건연산자(삼항연산자)
	public static void main(String[] args) {
		
		/*
		 #삼항연산자
		 -피 연산자가 3개인 연산자를 말합니다.
		 -(조건식 ? 좌항 : 우항) 
		 -조건식의 결과가 true면 좌항의 값, false인 경우 우항의 결과가 도출된다.
		
		 */
		int x =10 , y = 20;
		String result = ( x > y ? "x가 y보다 큽니다." : "x는 y보다 작습니다.");
		
		System.out.println(result);
		
		//난수를 발생시키는 매서드 Math.random(); 
		//0.0이상 1.0미만의 실수 난수값을 반환합니다.
//		double rn = Math.random();
//		System.out.println(rn);
//		1부터 10까지의 정수 난수를 발생시키고 싶을 때
//		int rn = (int)((Math.random()*10) +1); //int로 선언해주어서 소수점이하 버리기
//		System.out.print(rn);
	//10~100까지의 정수난수 발생
//		int rn2 = (int)((Math.random()*91)+10); // *곱할때 더하는만큼 덜 곱하기*
//	System.out.println(rn2);
	
	//34~176까지 정수 난수
		int rn3 = (int) ((Math.random()*143) + 34);
		System.out.println(rn3);
	}
}
