package basic.array;

import java.util.Arrays;

public class Array2Dimension {
	public static void main(String[] args) {
		//#이차원 배열
		//배열 안에 배열이 존재하는 형태
		//실제 배열에는 배열의 주소값이 들어가게 된다.
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12,13,14}
			};
	
		System.out.println(arr.length); //4 -> 배열 덩어리의 갯수
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(arr[2][1]); //이차원 배열에서는 대괄호를 두번적어야 하나의 값을 구할 수 있다.
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("-------------------------------------------------");
		
		//빈 이차원배열 만들기
		int[][] arr2 = new int[3][4];
		
		System.out.println(Arrays.deepToString(arr2));
		arr2[1][2] = 50;
		arr2[2][1] = 70;
		
		for(int[] array : arr2) {
			for(int i : array) {
				System.out.print(i + " ");
			}
			System.out.println(); //덩어리 출력될때마다 줄개행해라
			}
		
		
		
		}	
	}

