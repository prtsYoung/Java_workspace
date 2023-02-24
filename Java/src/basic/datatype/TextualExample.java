package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 65; //ASCII 코드
		System.out.println(c2);
		//Strng : 문자열 저장

		System.out.println(100+100);
		System.out.println("100"+"100");
		System.out.println("100"+100); //문자열 취급
		System.out.println(3.14 + "hi");
		
		int month =10;
		int day = 13;
		System.out.println("내 생일은 " + month +"월"+day +"일 입니다.");
		
		//typepcasting
		char c='a';
		int j ='c';
		System.out.println("A의 문자번호 : " + j);
		int k= 500;
		double d =k;
		System.out.println(d); //큰쪽으로 자동으로 형변환
		
	
	}

}
