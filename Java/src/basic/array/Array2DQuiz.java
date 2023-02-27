package basic.array;

import java.util.Arrays;

public class Array2DQuiz {
	public static void main(String[] args) {
		int[][] score = {
				{79,80,99}, //A학생
				{95,85,89}, //B학생
				{90,65,56}, //C학생
				{69,78,77} //D학생
				//과목은 3과목	
		};
		String[] stuName = {"A학생","B학생","C학생","D학생"};
		String[] subName = {"국어","영어","수학"};
		
		//1.각 학생의 평균을 소수점 첫째자리까지 출력해 보세요
		//2.각 과목의 평균을 출력해 보세요(국,영,수)
		//3.반 평균을 출력해 보세요(모든 학생들의 평균)
		int stuNum=0; //학생의 이름을 꺼내올 변수(인덱스)
		for(int[] array:score) {
			int total=0; //학생이 바뀔때마다 토탈은 0이 되어야하므로 반드시 여기에 선언이 되어야 한다.			
			for(int i : array) {
				total+=i;
			}
			
			double avg= (double) total/subName.length;
			System.out.printf("%s의 평균은 : %.1f점\n",stuName[stuNum],(double) total/subName.length);
			stuNum++;
		}
	System.out.println("-----------------------------");
	//2.각 과목의 평균
	for(int i=0; i <subName.length; i++) {
		int total = 0;
		for(int j =0; j<stuName.length; j++) {
			total += score[j][i];
		}
		double avg =(double)total / stuName.length;
	System.out.printf("%s의 평균점수 : %.1f점\n",subName[i],avg);
	}
		
		
		
	//3.
//		
//		double avgTotal=0;
//		for(int[] stu : score) {
//			for(int j : stu) {
//				avgTotal +=avg
//			}
//			
//			stuName++;	
//		}
//		double classavg = (double)avgTotal / stuName.length;
//		System.out.printf("우리반 평균은 얼마인가 : %.1f점\n",classavg);
//		
////		System.out.println("A학생의 평균 : " + s);
//		
//		
		
		
		
		
		
		
	}
}
