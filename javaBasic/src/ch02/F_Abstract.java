package ch02;

//추상 클래스 : 추상 메서드를 포함할 수 있는 클래스
//추상 클래스 자체로 인스턴스를 생성할 수 없음 , 반드시 추상클래스를 상속한 하위 클래스로 인스턴스를 생성해야함
// abstract class 추상클래스명{  }


// 추상 메서드 : 선언부만 존재하고 구현부는 존재하지 않는 메서드
// 반드시 추상 클래스를 상속받은 하위 클래스에서 오버라이딩해서 구현해야함
// abstract 반환타입 추상메서드명(매개변수);

//====== 예제 _ 게임을 만들어보자 ====== 무언가를 만들려고 할 때, 의견을 모으는 과정 ======
// Player
// 이름	: 문자열 
// 종족 	: 문자열
// 성별 	: 문자열
// 경험치	: 정수

// 대화	- 입력:(메세지 - 문자열) / 출력:void  
// 사냥	- 입력:(수치 - 정수) / 출력:(경험치 - 정수)
abstract class Player {
	String name;
	String species;
	String gender;
	double experience;
	
	
	// 추상클래스에서도 생성자를 만들 수는 있지만
	// 하위클래스에서 호출하는 용도로만 사용됩니다.
	Player(String name, String species, String gender, double experience) {
		super();
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.experience = experience;
	}

	final void chat (String message) { 						// final : 반드시 이 형태로만 써야한다라고 선언
		System.out.println(this.name + ": " + message);
	}
	
	abstract double hunt (int figure);           // abstract - 추상화 해놓고 나중에 구현하겠다\	
}

class Dealer extends Player {
	
	Dealer(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
		
	}

	double hunt (int figure) {
		System.out.println(figure + "만큼의 공격을 했습니다.");
		this.experience += (figure * 0.8);      // 경험치는 누적이기때문에 복합연산자 사용
		return this.experience;               // 추상메서드를 여기서 구현했다.
	}
	
}
class Tanker extends Player {

	
	Tanker(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
		
	}

	@Override
	double hunt(int figure) {
		System.out.println(figure + "만큼의 공격을 받습니다.");
		this.experience += figure;
		return this.experience;
	} 
}


public class F_Abstract {

	public static void main(String[] args) {
		
		// 추상 클래스는 인스턴스를 생성할 수 없음 - 생성자를 만들 수는 있음
//		Player player = new Player("이름", "인간", "남", 0);      //new *Player*(생성자 부분) Player 는 추상클래스로 완성이 되어있지 않아 그런 의미에 컴파일 오류가 뜬다. // 상속을 해주는 곳에서만 사용가능
	//  변수의 타입으로는 Player 사용가능 = 
		
		// 반드시 추상클래스를 상속하여 구현한 하위클래스로 인스턴스를 생성해야함
		Dealer dealer = new Dealer("이름", "인간", "남", 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
