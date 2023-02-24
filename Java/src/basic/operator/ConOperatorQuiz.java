package basic.operator;

public class ConOperatorQuiz {
	public static void main(String[] args) {
		//42~396  //397-42
		int rn = (int) ((Math.random()*355) +42) ;
		String result = (rn % 2 ==0 ? "짝수입니다." : "홀수입니다." ); //변수를 선언하고 변수에 담아주기
		System.out.println("발생한 난수 : " + rn);
		System.out.println("3항 연산의 결과 : " + result);
		
		
	}
}
