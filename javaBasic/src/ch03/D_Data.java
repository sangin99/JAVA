package ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 이름과 나이 프로그램 만들기 // 

class Member {
	String name;
	int age;
	
	Member (String name, int age) {
		this.name = name;
		this.age = age;
	
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";     // Object 에서 오버라이드 한 것
	}
}

public class D_Data {
// 스태틱 변수로 멤버들을 저장하는 데이터를 만들기
// List 사용
	static List<Member> members = new ArrayList<Member>();  // members 라는 참조변수에 ArrayList 빈 배열 생성!
	
	public static void main(String[] args) {
	
			while (true) {            // while - true : 무한반복되서 나온다
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("작업 : ");
				String input = scanner.nextLine();
				if (input.equals("종료")) break;         // 종료가 들어오면 break : while 문 강제종료
				if (!input.equals("입력") && !input.equals("보기")) continue;    // 그러나, "입력" . "보기" 가 아니면 조건식을 계속 하게 하는 것 : continue
				
				// "입력" 을 받으면 members 리스트에 요소 추가
				if (input.equals("입력")) {
					System.out.print("이름 : ");
					String name = scanner.nextLine();
					System.out.print("나이 : ");
					int age = scanner.nextInt();
					System.out.println(name + " " + age);
					
					Member member = new Member(name, age);
					members.add(member);                         // 계속해서 넣는 것을 만드는 작업 성공!
				}
				
				// "보기" 라는 입력을 받으면 members 리스트를 보여줌
				if (input.equals("보기")) {
					System.out.println(members);
				}                                
// "종료"를 입력하고 다시 run 을 하면 이전 데이터는 사라진다 그렇다면 방법은? 데이터를 메모리에 "저장"을 한다! = ★Git 의 활용★   => DBMS 의 활용
				
				
			
			}
 	}

}
