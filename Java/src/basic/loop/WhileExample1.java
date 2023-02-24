package basic.loop;

public class WhileExample1 {
	public static void main(String[] args) {
		//while (조건) {
			//결과 }
		
		/*
		 #while문의 진행 순서
		 1. 제어변수를 선언(시작값이 정해짐)
		 2. while문의 조건식을 검사해서 true면 반복문이 시작, false라면 반복문이 종료
		 3. while문의 블록 내부가 한번 진행되면 다시 조건식을 검사한다. true라면 반복문 계속 진행
		 	false라면 반복문 종료
		 4. 반복문 내(블록 내)에는 증감식을 배치하여 제어변수의 값을 조정
		 */
		
		
		int i = 1; //제어변수(begin)
		
		while(i <= 10) { //논리형 조건식 : 반복문의 끝을 지정. (end)
			System.out.println("안녕하세요" + i);
			i++; //증감식 : 반복문의 종료를 위해 제어변수의 값을 조정(step)
		}
		
		System.out.println("----------------------------------------");
		
		//1~10까지의 누적합계
		int n =1;
		int total = 0; //누적합을 기억해 줄 변수
		while(n <= 10) {
			total +=n;
			n++;
			
		}
			System.out.println("1부터 10까지의 누적합 : " + total);
	}
}
