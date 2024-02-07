package ch03;      //24.01.29 월

import java.util.ArrayList;
import java.util.List;

// 제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법 
// 받고자 하는 데이터 타입(나중에) <매개타입.T> 

// Test1 . Test2 형태로 클래스를 사용하게 되면 코드의 중복이 발생함
class Test1 {
	String subject;
	int score;
}

class Test2 {
	String subject;
	String score;
}

// Test3 형태로 클래스를 사용하게되면 타입의 안전성이 떨어짐
class Test3 {
	String subject;
	Object score;      // Object 로 업캐스팅 하면 코드중복 해결가능! 전부 해결가능! but, 코드의(타입에 대한) 안정성 ↓
}

// 위의 두 가지 문제점을 해결하기 위한 방안 : 제너릭
// 제너릭 클래스 : 클래스 내부에 있는 데이터 타입을 외부에서 받아오려 할 때 사용
// class 클래스명<매개타입> {메개타입 변수명; ...}
class Test4<T> {
	String subject;
	T score;
}

class Test5 {
	
	// 제너릭 메서드 : 해당 메서드의 매개변수의 타입이나 반환타입에서 사용할 타입을 외부에서 받아오려 할 때 사용
	// <매개타입> 반환타입 매서드명 (<매개타입> 매개변수) {...}
	static <T> void method (List<T> arg) {     // List<T> : 제너릭을 받는 타입
		System.out.println(arg);
	}
	
	// ? : 와일드 카드로 제너릭에 대해서 모든 타입을 받을 수 있도록 함
	static void wildCardMethod (List<?> arg) {
		System.out.println(arg);
	}
	
	// ? extends 클래스명 : 특정 클래스 혹은 특정 클래스'를' 확장한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인클래스 또는 자손클래스)
	static void extendMethod (List <? extends MyClass> arg) {
		System.out.println(arg);
	}
	
	// ? super 클래스명 : 특정 클래스 혹은 특정 클래스'가' 확장하는 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인클래스 또는 조상클래스)
	static void superMethod (List<? super MyClass> arg) {
		System.out.println(arg);
	}
}


class SuperClass{					
	
}

class MyClass extends SuperClass {
	
}

class SubClass extends MyClass {
	
}

public class C_Generic {

	public static void main(String[] args) {
		
		Test3 myTest = new Test3 ();
		myTest.subject = "국어";
		myTest.score = 95;	
		
		Test3 yourTest = new Test3 ();
		yourTest.subject = "경영학원론";
		yourTest.score = "A+";
		
		
		Test4<Integer> hisTest = new Test4<>();      // score 타입이 결정난다.
		hisTest.score = 95;
//		hisTest.score = "A+";
		
		Test4<String> herTest = new Test4<>();
		herTest.score = "A+";
		
		hisTest.score++;
//		herTest.score++;   -- String 문자열이라서 ++ 컴파일 오류 발생
		
	// Test5 << <T>
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		
		List<Boolean> arrayList2 = new ArrayList<>();
		arrayList2.add(true);
		arrayList2.add(false);
		arrayList2.add(true);         
		
		Test5.method(arrayList1);	  // <T> 의 타입이 String 으로 결정 나버림
		Test5.method(arrayList2);     // <T> 의 타입이 Boolean 으로 결정 나버림
		
// ※ 제너릭에 들어오는 타입이 업캐스팅이 안된다! _ WHY? 만약 가능하다면, Object 를 넣어도 식이 성립이 되어야하는데 그렇지 않는다! ※ 
		
		Test5.wildCardMethod(arrayList1);
		Test5.wildCardMethod(arrayList2);    // 42번 라인 참고
		
		
		SuperClass superClass = new SuperClass();
		MyClass myClass = new MyClass();
		SubClass subClass = new SubClass();
		
		List<SuperClass> superList = new ArrayList<>();
		superList.add(superClass);
		
		List<MyClass> myList = new ArrayList<>();
		myList.add(myClass);
		
		List<SubClass> subList = new ArrayList<>();
		subList.add(subClass);
		
//		Test5.extendMethod(superList);
		Test5.extendMethod(myList);
		Test5.extendMethod(subList);      // 47번 줄 참고
		
		Test5.superMethod(superList);
		Test5.superMethod(myList);
//		Test5.superMethod(subList);      // 52번 줄 참고
		
		
	}

}
