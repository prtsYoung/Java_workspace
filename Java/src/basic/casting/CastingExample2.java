package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		int i =72;
		char c = (char)i;
		System.out.println("72의 문자값: " + c);
		
		double d= 4.98765;
		int j =(int)d;
		System.out.println(j);
		 int k = 1000;
		 //크기가 큰 데이터 값을 데이터입으로 변화놔려면 반드시 형변환 연산자를 사용하여 명시적으로 (type)
		 //형변환을 해주어야한다.
		 //명시적으로 형변환을 해야하는 이유는 다운캐스팅의 경우 저장공간이 줄어들어 데이터 손실의 가능성이
		 //항상 존재하기 때문이다.
		 
	
	}

}
