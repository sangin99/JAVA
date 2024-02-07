package ch02;

// 기타제어자(비접근 제어자) : 접근 제어와 무관하게 동작을 제어하는 것
// final 제어자 : 
// - 클래스 : final 제어자가 붙은 클래스는 확장(상속)할 수 없음
// - 메서드 : final 제어자가 붙은 메서드는 오버라이드 할 수 없음
// - 변수 : final 제어자가 붙은 변수는 재할당할 수 없음

//=================================================
final class FinalModifier1 {
	int variable;
	
}
	
//class SubModifier1 extends FinalModifier1 {
//	
//}    The type SubModifier1 cannot subclass the final class FinalModifier1 : 컴파일 오류 내용

//==================================================
class FinalModifier2 {
	
	final void method () {}
}
	
class SubModifier2 extends FinalModifier2 {
	
//	void method () {}   Cannot override the final method from FinalModifier2 : 컴파일 오류 내용
}

//===================================================
class FinalModifier3 {
	
	final int variable = 10;    // 초기화
	
	void method () {}
//		variable = 20;      // 재할당 불가
}
	
//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\\/\/\/\/\/
// static 제어자 :
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수 : static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능
class StaticModifier {
	static int variable;
	
	static void method () {}
}

// (모든)제어자의 조합
class Combination {
	
	// ***(가장 많이 사용) public + static + final >> static . final 이 public 과 (+) 하는 형태로 많이 사용이 된다.
	public static final int NUMBER = 10;
	
	// (사용 안 하는 조합) 메서드에서 private + final >> private : 외부접근 x | final : 오버라이드 x  --> 애초에 private 가 오버라이드가 이미 안 되는 상황
	private final void method () {}
	
	// 메서드에서 private + abstract --> 서로 상충되는 내용 . (말이 안되는 조합)
	// 클래스와 메서드에서 final + abstract --> 서로 상충되는 내용 . (말이 안되는 조합)
	
}

public class D_Modifier {

	public static void main(String[] args) {
		StaticModifier.variable = 0;
		StaticModifier.method();

	}

}
