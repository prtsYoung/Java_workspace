package basic;

public class AssignmentOperator {

	public static void main(String[] args) {
		//대입연산자(=)
		//복합대입연산자(+=,-=,*=,/=,%=(나누고 나머지를 가져옴)) : 변수에 값을 대입할때 사용하는 연산자로,
		//대입연산자에 산술연산자가 결합되어있는 형태이다.
		
		int a = 5;
		int b = 5;
		a+=3; //a=a+3
		System.out.println(a);
		
		System.out.println("--------------------");
		
		 a-=4;// 4
		 System.out.println(a);
		 a*=6; //24
		 System.out.println(a);
		 a/=5; //4
		 System.out.println(a);
		 a%=3; //1
		 System.out.println(a);
		 
	}

}
