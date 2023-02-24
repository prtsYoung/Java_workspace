package basic.loop;

public class ForQuiz1 {
public static void main(String[] args) {
	
	//2~19까지의 난수를 생성하여 구구단 출력 19행까지
	
	int i = (int) ((Math.random()*18) +2); //난수 * 19
	int j;
	for( j=1 ; j<=19 ; j++) {
		System.out.printf("%d X %d = %d\n",i,j,(i*j));
	}
	
	
	
}
}
