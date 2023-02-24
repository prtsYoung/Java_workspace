package basic.loop;

public class BreakExample1 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			if(i > 7) break; //If에 {}내용이 하나라면 {}생략 가능
			System.out.print(i + " ");
		}
		System.out.println("반복문 종료!");
		
		
		System.out.println("---------------------------------");
		
		//내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에 종료시키고 싶다면 바깥쪽 반복문에
		//lable을 붙입니다. 그리고 break 선언시 lable을 함께 외쳐줍니다.
		
		outer : for(int i=0; i<=2; i++) {
			for(int j=0; j<=1; j++) {
				if(i == j) {
					break outer; 
			//break는 자기가 속해있는 반복문만 종료된다. 한번에 종료하기 위해서는 반복문 앞에
					//이름을 붙여주고 [break] [붙인이름]; 
				}
				System.out.println(i + "-" + j);
			}
		} 

		
		
		
		
	}
	
}
