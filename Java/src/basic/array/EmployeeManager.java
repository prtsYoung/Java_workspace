package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//사원의 정보 : 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int count =0; //실제로 입력된 데이터 몇개인지 사원의정보의 개수 체크

		

		//메뉴를 열고 while true로 원할때 종료될수있게 설정


		while(true) {
			System.out.println("\n-------사원관리 프로그램 -------------");
			System.out.println("#1. 사원정보 신규 등록");
			System.out.println("#2. 모든 사원 정보 보기");
			System.out.println("#3. 사원 정보 검색");
			System.out.println("#4. 사원 정보 수정");
			System.out.println("#5. 사원 정보 삭제");
			System.out.println("#6. 프로그램 종료");
			System.out.println("-------------------------------------------");

			//1.사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
			//  사번은 중복되면 안됩니다.
			//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)
			//2.각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
			//  만약 사용자가 사원 등록을 한 명도 하지 않았다면
			//  "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다. 사번배열만 확인해도됌
			//3.입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
			//  입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

			System.out.print(">");
			int menu = sc.nextInt();
		

			if(menu == 1) { 
				System.out.println("사원 정보를 입력하세요");
				System.out.print("사번: ");
				String empNum = sc.next();

				while(true) {
					boolean flag = false;
					for(int i=0; i<userNums.length; i++) {
						if(empNum.equals(userNums[i])) {
							System.out.println("사번이 중복 되었습니다.");
							flag = true;
							break;
						}
					}

					if(!flag) {
						userNums[count] = empNum;
						break; //사번 중복 체크를 위한 while true를 빠져나오는 break;
					} else {
						System.out.print("사번 재입력: ");
						empNum = sc.next();
					}
				}

				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("나이: ");
				int age = sc.nextInt();
				System.out.print("부서: ");
				String department = sc.next();

				names[count] = name;
				ages[count] = age;
				departments[count] = department;
				count++;
				System.out.println("사원 등록이 완료되었습니다.");

			} else if(menu == 2) {
				if(count == 0) {
					System.out.println("조회할 사원이 없습니다. 먼저 등록부터 하세요.");
				} else {
					for(int i=0; i<count; i++) {
						System.out.printf("사번: %s\t이름: %s\t나이: %d세\t부서: %s\n"
								, userNums[i], names[i], ages[i], departments[i]);
					}
				}
			} 

			else if(menu == 3) {
						System.out.println("사원 번호를 입력해주세요");
            String empNum = sc.next();

            boolean flag = false;

            for (int i = 0; i < userNums.length; i++) {
                if(empNum.equals(userNums[i])){
                    System.out.println(userNums[i]);
                    System.out.println(names[i]);
                    System.out.println(ages[i]);
                    System.out.println(departments[i]);
                    flag = true;
                    break;
                }
            }
                if(!flag) {
                    System.out.println("등록이 안됐어요");
                }
//				
//						} else if(menu == 4) {
//							empNum = sc.next();
//							for(int i=0; i< userNums.length; i++) {
//								if(userNum.equals(userNums[i])) {
//									System.out.println("1. 나이변경");
//									System.out.println("2. 부서변경");
//									System.out.println("3. 취소");
//									int select =sc.nextInt();
//									
//									if(select == 1) {
//										System.out.println("나이를 변경..");
//										} else if() {} else
//								}
//								
//								}
							}
								else if(menu == 5) {
									
									System.out.println("정말 삭제하시겠습니까? (Y/N)");
									String YN = sc.next();
								if(YN.equals("Y")) {
									String[] tempUserNum = new String[count-1];
									String[] tempName = new String[count-1];
									int[] tempAge = new int[count-1];
									String[] tempDPM = new String[count-1];
									System.out.print("사번을 입력하세요  : ");
									String empNum = sc.next();
									for (int i = 0; i < tempUserNum.length; i++) {
						                if(empNum.equals(userNums[i])){
						                    tempUserNum[i]=userNums[i];
						                   tempName[i]=names[i];
						                    tempAge[i] =ages[i];
						                    tempDPM[i] = departments[i];
						                    }
						                
						               
						                }
									userNums=tempUserNum;
									tempUserNum= null;
									names=tempName;
									tempName=null;
									ages = tempAge;
									tempAge=null;
									departments = tempDPM;
									tempDPM = null;
									
									System.out.println(Arrays.toString(userNums));
									System.out.println(Arrays.toString(names));
									System.out.println(Arrays.toString(ages));
									System.out.println(Arrays.toString(d));
								}else if(YN.equals("N")){System.out.println("삭제취소");
			                    continue;}
//								
								
								
							
						}else if(menu == 6) {
							System.out.println("프로그램을 종료합니다.");
							sc.close(); break; //while true break
						} else {
							System.out.println("메뉴를 잘못입력하셨습니다.");
							continue; //건너뛰고 다시 반복문 처음으로 돌아가는거
						}
						
						
						
						
					} // end while true
					
					

		



		}
}
