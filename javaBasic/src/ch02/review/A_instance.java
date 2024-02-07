package ch02.review;

public class A_instance {

	public static void main(String[] args) {
		
	// 객체(인스턴스) : 실체 / 클래스에 정의된 대로 만들어진 독립적인 실체
		// 클래스로 '생성(인스턴스를 만드는 작업)'하는 작업이 이루어짐
		// new 연산자를 사용하여 생성 - new 클래스명();
		ExampleClass instance = new ExampleClass();   // 같은 패키지 내부에 있는 다른 클래스여도 사용 가능 - 그래서 같은 패키지 내에 다른 클래스에서 같은 이름으로 class를 생성하면 컴파일오류발생
		// 인스턴스라는 이름의 참조변수선언 = 인스턴스 생성
		
		// 참조 : 아래 코드는 변수를 선언
		int number; //변수선언
		ExampleClass example; // 변수선언
		
		// 참조 : 아래 코드는 인스턴스
		new ExampleClass();
		
		// 인스턴스 변수와 메서드 접근 혹은 호풀 : 인스턴스.변수 / 인스턴스.메서드()
		instance.instanceVariable = 0;
		instance.instanceMethod();
		
		new ExampleClass().instanceVariable = 0;   //식이 가능은 하나, 담긴 순간 끝나버린 것이다
		
		// 참조 : 아래 코드는 인스턴스가 복사된 것이 아니라 인스턴스 주소가 복사되어 할당 되는 것
		ExampleClass anotherInstance = instance;
		
		
	}

}
