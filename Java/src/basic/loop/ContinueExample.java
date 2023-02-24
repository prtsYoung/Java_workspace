package basic.loop;

public class ContinueExample {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i % 2 !=0) continue; //건너뛰는거 ->5만빼고 출력됌
			System.out.print(i+" ");
		}
		System.out.println("\n반복문종료");
	}
}
