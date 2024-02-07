package ch02_sub;

class InterfaceSub implements G_Message {
	
	int method3 (int number) {
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBYE_MESSAGE);
		return 3 + number;
	}
}

public class G_InterfaceSub implements G_Message, G_Method {        // implements G_Message << 여기서 선언함으로 밑에 *G_Message* 생략 가능

//	void method1 () {
//		System.out.println("반갑습니다.");
//		
//		System.out.println("수고 하셨습니다.");
//	}
//	
//	void method2 () {
//		System.out.println("반갑 습니다.");
//		
//		System.out.println("수고하셨습니다.");
//	}
	

	// method1 () : 컴파일 오류? : G_Method 를 구현시키니 오류가 떴다 | Q. 인터페이스에 정의된 대로 여기에다가 했는가? A. "public"
	public void method1 () {    // Static 의 사용으로 ch02_sub -G_Message에서 가져옴
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBYE_MESSAGE);
	}
	
	public void method2 () {
		System.out.println(G_Message.GREETING_MESSAGE);
		
		System.out.println(G_Message.GOODBYE_MESSAGE);
	}
}
