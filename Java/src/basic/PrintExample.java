package basic;

public class PrintExample {

	public static void main(String[] args) {
		//자바의 표준 출력 형식은 크게 3가지
		//1.개행을 포함하지 않는 print()
		//2.자동으로 개행을 포함해주는 println()
	
		System.out.print("안녕하세요");
		System.out.println("Hello"); //문장을 출력하고 마지막 커서가 다음줄로 넘어가고 끝이남
		System.out.print("잘가");
		System.out.println("bye");
		
		//3.형식지정 표준 출력방식 printf() :서식 문자를 이용하여 문자열을 완성시킨 후,
		//서식 문자에 들어갈 값을 지정하여 출력하는 방식
		
		
		/*
		 #포멧티 서식 문자종류 : printf에서만 사용가능하다.
		 -%d : 부호가 있는 정수 데이터 (decimal)
		 -%f : 실수 데이터 (floation point)
		 -%s : 문자열 (String)
		 */
		
		//탈출문자 (Escape Code) :print,printf,println 모두에 사용 가능하다.
		// \n:줄 개행 명령
		// \t : 가로 공백(스페이스 4칸)
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		System.out.println(month + "월 " + day + "일은 " + anni + "입니다." );
		System.out.printf("%d월 %d일은 %s입니다.\n",month,day,anni);
		
		double rate = 64.126; 
		
	
		System.out.printf("합격률은 %.3f%%입니다.",rate);
		//%f에 %.원하는자릿수f -> 원하는 자릿수만큼 소수점 출력
		//printf에서 문자%를 표현하고 싶을 때, 하나만 쓰면 오류 두개씩 써주어야한다.
		

	}

}
