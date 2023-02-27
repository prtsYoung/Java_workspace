package basic.array;

import java.util.Arrays;

public class EnhancedForLoop {
	public static void main(String[] args) {
		/*
		 #향상된 for문 (for-each문)
		 -제어변수(인덱스)의 사용없이 배열 내부의 요소를 전체 참조할 수 있게 해주는 반복문
		   ex)
		   for(배열 요소를 받아줄 수 있는 변수 : 배열변수명){
		   반복실행문
		   } 
		 */
		String[] week = {"월","화","수","목","금","토","일"};
		
//		for(int i=0; i<week.length; i++) {
//			System.out.println(week[i] + "요일 좋아");
//		}
		
		//for-each문은 전체 범위만 가능하다.
		for(String day : week) {
			System.out.println(day + "요일 좋아"); 
		} 
		
		int[] scores = new int [] {96,88,74,63,100,55};
		
		int sum=0;
		for(int x :scores) {
			sum+=x; //누적합
		}
		double avg;
	
			avg = (double)sum/scores.length;
		
		
		System.out.println(sum);
		System.out.printf("평균은 : %.2f",avg);
		
		
		
		
		
	}
}
