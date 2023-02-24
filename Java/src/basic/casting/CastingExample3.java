package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		char c ='B';
		int i = 2;
		System.out.println(c+i);
		
		int intResult = c+i;
		char charResult = (char)(c + i);
		System.out.println(intResult);
		System.out.println(charResult);
		
		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에 
		//작은쪽이 맞춰져서 자동으로 형변환이 된 후 진행된다.
		
		int k = 10;
		double d = k/4;
		System.out.println(d);
		
		byte b1= 100;
		byte b2 = 70;
		System.out.println(b1+b2); //자동으로 인트로 변환(데이터손실 방지)

		//(int)와 같은 형변환연산자가 하나 있을때 단항연산자, k++,k--같은 경우도 단항
		//이항연산자 : 연산을 당하는 값이 2개이게 하는 연산자 ex) 3+4, 3<4
		//삼항연산자 : 연산을 당하는 값이 3개인 연산자

	}

}
