package basic.loop;

public class LoopNesting {
	public static void main(String[] args) {
		//반복문 중첩
		//-외부 반복문 내부에 반복문이 존재하는 형태를 반복문 중첩이라고 한다.
		//반복문 자체를 반복시켜야 할 경우에 사용
		//내부반복문이 종료가 되어도, 외부반복문이 끝나지 않는다면 내부 반복문은 외부 반복문의
		//제어변수의 크기 및 범위까지 계속해서 반복 실행된다.
		for(int i=2; i <=9; i++) {
			System.out.println("구구단 " + i + "단");
			for(int j =1; j <=9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,(i*j));
			} System.out.println("-----------------");
		}
	}
	
}
