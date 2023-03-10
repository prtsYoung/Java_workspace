package basic.array;

import java.util.Arrays;

public class ArrayDelete {
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5 ,7 , 9, 11, 13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		
		//삭제되는 값을 기준으로 뒤에 있는 값을 한칸씩 앞으로 땡기는 작업
		//추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 대입하려 하는 작업
		for(int i=3; i<arr.length-1; i++) { //3번 인덱스부터 3+1의 인덱스를 끌어와서 앞으로 당김
			arr[i] = arr[i+1];
			
		}
		
		//기존의 배열보다 크기가 하나작은 새 배열을 생성
		int[] temp = new int[arr.length -1];
		
		//원본 배열의 값을 새 배열에 인덱스 맞춰서 그대로 대입하기
		temp[0] = arr[0];
		temp[1] = arr[1];
		temp[2] = arr[2];
		
		for(int j = 0; j<temp.length; j++) {
			temp[j] = arr[j];
		}
		
		System.out.println(Arrays.toString(temp));
		
		arr = temp; //arr에게 temp의 주소를 넘김 //temp배열의 주소값을 arr에게 넘긴다.
		temp = null; //주솟값을 지워서 메모리에서 temp는 자동 소멸하게 합니다.
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
	}
}
