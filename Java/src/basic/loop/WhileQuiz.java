package basic.loop;

public class WhileQuiz {
	public static void main(String[] args) {
		//1~30000 258의 배수 개수 출력
		int n = 1;
		int count =0;
		while(n <= 30000) {
			if(n % 258 == 0) {
				System.out.println(n);
				count++;
				} n++;
		} System.out.println("갯수" + count);
		
		//1000의 약수의 개수
		//1부터 1000까지 올려보면서 1000이랑 나누어보세요
		System.out.println("-------------------------------------");
		int i = 1;
		int count1 = 0;
		while( i <= 1000) {
			if(1000 % i == 0) {
				System.out.println(i);
				count1++; //약수의 갯수 세어주는애
				} i++;
			 } System.out.println("약수의 갯수는 : " + count1 + "입니다.");
			 
			
			 
			 
			 
			 
	}
		
	}

