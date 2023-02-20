package basic;

public class LogicalOperator {

	public static void main(String[] args) {
		//비교 연산자 
		//좌항과 우항의 크기를 비교하여, 결과값으로 항상 논리형 타입의 값을 도출.
		int x = 10, y =20;
		System.out.println(x!=y);
		System.out.println(x==y);

		//논리연산자(&,&&,|,||)
		//좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출
		//1.&,&& : 양쪽항의 논리값이 모두 true일 경우에만 true가 도출
		//2.|,|| : 양쪽항의 논리값 중 한쪽만 true여도 true
		
		//논리연산자 두개를 사용하는 이유: 앞에것이 거짓이면 연산을 종료하기 때문에 연산속도가 빨라진다.
		//&&,|| : 단축 평가 연산
		//-좌항의 연산 결과가 전체 연산 결과에 영향을 미칠경우 우항의 연산을 진행하지 않는다. 
		System.out.println(x>10 && (y /0 ==10));
		System.out.println(x>10 || y < 30);
		
		//논리반전 연산자 (!: 단항)
		//단순히 논리값을 반전시킬 때 사용
		//true ->false, false -> true
		int z = 10;
		System.out.println(!(z==10));
		
		
	}

}
