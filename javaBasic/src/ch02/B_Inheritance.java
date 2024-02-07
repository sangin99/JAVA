package ch02;

//상속 : 객체지향 프로그램밍의 특성 중 하나
//		 원래 존재하던 클래스를 확장하여 재사용할 수 있도록 하는 것

	//장점 : 코드중복을 제거하고 확장성을 높일 수 있음
	//extends 키워드를 사용하여 확장

	//class Subclass extends Superclass {}
//========================== 예제** ===================
class Human {
	String name;
	int age;
	
	void sleep () {
		System.out.println(name + "가 잠을 주무십니다.");
	}
}														// 중복된 내용 확장 시키기 ex_"extends Human" 기입

class Animal {
	String species;
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
}
// JAVA에서는 클래스의 단일 상속만 지원함
// 다이아몬드 문제를 방지하기 위한 이유때문에
// 	다이아몬드 문제?? 다중 상속을 했을 때 발생하는 메서드 호출의 모호성
// 아래 코드에서는 'extends Human, Animal' 형태로 다중 상속을 할 수 없음

class Teacher extends Human {			// Teacher : name / age / specise / course /../  "sleep(H."잠을 주무십니다") . sleEp(A."잠을 잡니다")" . teach() ... " -- " : 다이아몬드문제-어떤 것을 가져와야할지 모르는 상황
	String course;
	
	
	void teach () {
		System.out.println(name + "가" + course + "를 가르칩니다.");
	}
}

class Developer extends Human {
	String position;
	
	
	void develop () {
		System.out.println(name + "가" + position + "개발을 합니다.");
	}
}
// 이름 . 나이. "잠을 잡니다" - 중복되는 영역을 고치는 것에 대한 예시* ====================


// ★★★★★ 모든 클래스는 'Object' 라고 하는 최상위 클래스를 반드시 상속받고 있음 ★★★★★


public class B_Inheritance {

	public static void main(String[] args) {
	
		Human human1 = new Human();
		human1.name = "홍길동";
		human1.age = 0;
		human1.sleep();
		
		Teacher teacher1 = new Teacher(); 			//확장된 개념으로 같이 가지고 있다
		teacher1.name = "김철수";
		teacher1.age = 10;
		teacher1.course = "국어";
		teacher1.sleep();
		teacher1.teach();
		
		Developer developer1 = new Developer();    //확장된 개념으로 같이 가지고 있다
		developer1.name = "이미임";
		developer1.age = 30;
		developer1.position = "백엔드";
		developer1.sleep();
		developer1.develop();
	}

}
