package basic.loop;

public class WhileExample2 {
	public static void main(String[] args) {
		//48~150사이의 정수중 8배수만 가로로 출력
		
		int i = 48;
		
		while(i <= 150 ) {
			if(i % 8 == 0 ) {
				System.out.print(i+" ");		
			}
			i++; //i++; 위치 신경쓰기 // i+=8 -> 8씩 올릴때 이렇게 사용
		}
		
		System.out.println("-------------------------------\n"); //단순 줄개행
		
		//1~100까지의 정수 4의 배수이면서 8의 배수가 아닌수 출력
		int n = 1;
		while(n <=100 ) {
			if(n % 4 ==0 && n % 8 !=0) {
				System.out.print(n + " ");
			}
			n++;
		}
 		
		
		
		
	}
}
