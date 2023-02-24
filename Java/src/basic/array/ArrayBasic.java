package basic.array;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {
		//배열 : 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형
		//1.배열 변수의 선언 : int[] arr;, int arr[];
		int[] arr; //자바 배열 스타일
		int arr2[]; //c style
		
		//2.배열 객체를 생성 -> 실제 값들이 저장될 공간을 형성
		//생성할 때 배열의 크기를 정해주어야 한다.
		
		arr = new int[5]; //배열의 크기
		//3.배열의 초기화 : 배열의 내부에 실제 값을 넣어주기
		//배열의 초기화는 인덱스를 통해 수행한다. (배열 내부에 위치를 조정할 수 있는 값)
		//인덱스는 0번부터 시작하여 1씩 순차적으로 증가한다.
		arr[0] =1; //각각의 방에 지정해주기
		arr[1] =2;
		arr[2] =3;
		arr[3] =(int) 3.14; //같은 데이터 타입만 들어갈 수 있기 때문에 형변환
		arr[4] =arr[1];
	
		//arr[5] -> rumtime error : 실행해야 에러인지 알 수 있는 에러
		//4.배열의 총길이
		System.out.println(arr.length); //배열의 길이(크기) 확인 : 배열의 크기 이상으로 넣으면 오류가 뜬다.
		
		//5. 배열에 저장된 값 참조하는법
		System.out.println("배열의 첫번째 데이터는" + arr[0]); //인덱스 이용
		
		System.out.println("--------------------");
		//6.배열의 반복문 처리
		//배열은 인덱스 번호를 제어변수로 활용하여 쉽게 반복문을 처리할 수 있다.
		for (int idx = 0; idx < arr.length; idx++) { //배열이니까 0부터 시작해야한다. //배열의 길이 전까지
			System.out.printf("배열의 %d번째 데이터 : %d\n",idx+1,arr[idx]);
		}
		System.out.println(); // 배열내부를 한번에 볼 수 있는방법은 없음
		//7.배열 내부의 요소값을 문자열 형태로 한눈에 출력하기
		System.out.println(Arrays.toString(arr)); //배열 내부를 문자열형태로 변형해서 한눈에 보여줌
		//문자열 변수에 넣어 활용할 수 있다.
		int[] arr4 = new int[4];
		
	 //8.배열의 선언과 생성을 동시에 하기
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		//배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화 된다.
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		//9.배열의 생성과 동시에 초기화도 진행하는 방법
		char[] letters = new char[] {'A','B','C','D'};
		System.out.println(Arrays.toString(letters));
		//선언과 동시에 초기화를 할때 딱 1번만 가능한 문법
		//배열은 크기가 고정되기 때문에 그 이후에 추가하려하면 추가가안된다. 줄이는 것도 마찬가지.
		//만약 배열의 크기를 늘리거나 줄이고 싶다면 기존의 배열을 조작하는 것이 아니라
		//새롭게 생성해야 함.
		String[] names = {"가렌","럭스","나미","소라카"};
		names = new String[] {"가렌","럭스","나미","소라카","케이틀린"}; 
		//->앞에 뉴스트링을 붙이고 다시 선언해야함
		System.out.println(Arrays.toString(names));
		
		
		
	}
}
