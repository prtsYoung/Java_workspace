package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		//증감연산자 (++,--)
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용한다.
		//단독으로 사용할때는 앞에 붙이나 뒤에 붙이나 연산결과에 차이가 없다.
		
		int i =1;
		int j=i++; //후의연산 : 선연산, 후증감
		int k =i--;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		int x = 1;
		int y = ++x; //전위 연산 : 선층감, 후연산
		int z =--x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	
		int a=3;
		int b = a-- +5*3;
		System.out.println(a);
		System.out.println(b);
		

	}

}
