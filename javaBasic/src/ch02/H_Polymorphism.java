package ch02;

//**다형성 : 하나의 표현이 여러가지 형태로 나타낼 수 있는 것

// 오버로드 : 같은 클래스 내에서 동일한 메서들의 이름으로 여러개의 메서드를 정의할 수 있도록 하는 것
// 오버라이드 : 클래스 간 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것 . 선언부가 모두 같아야한다.

class Human1 {
	String name;
	int age;
}

class Developer1 extends Human1{
	String position;
}

class FootballPlayer1 extends Human1 implements FootballPlay {
	int goal;

	@Override
	public void kick() {
		
	}
}

interface FootballPlay {
	public abstract void kick ();
}
public class H_Polymorphism {

	public static void main(String[] args) {
		
		Human1 human1 = new Human1();
		Developer1 developer1 = new Developer1();
		FootballPlayer1 footballplayer1 = new FootballPlayer1();
		
		// ★★★업캐스팅 : 하위 클래스의 객체를 상위 클래스의 참조변수에 담을 수 있도록 변환하는 것
		//			인터페이스 구현 클래스를 구현한 인터페이스의 타입 참조변수로 담을 수 있도록 하는 것
		Human1 human2 = new Developer1();
		Human1 human3 = new FootballPlayer1();
		
		FootballPlay football = new FootballPlayer1();
		
		// human2.position = "";
	
		// ★★ 다운캐스팅 : 업캐스팅된 객체를 다시 원래의 타입의 참조변수에 담을 수 있도록 변환하는 것
		Developer1 developer2 = (Developer1) human2;  // () : 강제로 명시적으로 지정을 한다.
		developer2.position = "";
		
		// Object 클래스의 참조변수는 어떠한 클래스의 인스턴스도 받을 수 있다
		Object object1 = new Human1();
		Object object2 = new Developer1();
		Object object3 = new FootballPlayer1();	

//====>> 여기까지가 갤러리-사진 (1) 내용 <<====
		
		FootballPlayer1 footballplayer = new FootballPlayer1();
		footballplayer.name = "홍길동";
		footballplayer.age = 30;
		footballplayer.goal = 55;
		
		System.out.println(footballplayer);
		System.out.println(footballplayer.age);
		System.out.println(footballplayer.goal);
		
// *업캐스팅 go
		Human1 human = footballplayer;
		System.out.println(human);      // footballplayer 와 동일한 주소를 가진다. 같은 곳을 바라보고 있다.
		System.out.println(human.name);
//		System.out.println(human.goal);
//		human.kick(); 						// 시야에 없기 떄문에 사용할 수 x
		
// *다운캐스팅 go
		FootballPlayer1 fpp = (FootballPlayer1) human; // () : 강제로 명시적으로 지정을 한다. 강제로 다시 시야를 넓히는 작업
		System.out.println(fpp);
		System.out.println(fpp.name);
		System.out.println(fpp.goal);
		
//	※주의사항※ ※주의사항※ ※주의사항※ ※주의사항※
	Human1 hmm = new Human1();
	Developer1 dev = (Developer1) hmm;
	
	dev.position = "포지션";
	System.out.println(dev.position);
	// 부모 클래스를 통해 만든 참조변수를 자녀 클래스로 만드는 일은 없다.

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
