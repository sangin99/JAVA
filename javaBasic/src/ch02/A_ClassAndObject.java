package ch02;

// 클래스 : 공통된 속성과 기능을 하나로 정의해둔 것
// [접근제어자] class 클래스명 { 속성 , 기능 }
// 주의**클래스를 선언할 때는 클래스 외부에서 선언해준다
class ExampleClass1 {
	// 속성 : 클래스가 가질 수 있는 정보나 상태
	// 일반적으로 변수로 표현
	
	// 인스턴스변수
	// 각 인스턴스마다 독립적으로 값을 가지는 변수 // 인스턴스에서만 사용 가능
	int attribute1;
	double attribute2;
	
	// 클래스변수(스테틱 변수,정적 변수)
	// 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수 // 클래스에서만 사용 가능
	// 속성 앞에 static 키워드를 사용하여 지정할 수 있음 
	static int staticAttribute;
	
	
	// 기능 : 클래스가 가질 수 있는 행동이나 작업 (메서드)
	// 클래스로 생성된 객체를 통해서 호출 가능
	// [접근제어자 일반제어자] 반환타입 메서드명 (매개변수타입 매개변수명[, ...])   -- 선언부
	// { 메서드 기능 구현 }											   -- 구현부
	
	// 매개변수 : o , 반환값 : o
	int method1 (int arg1, int arg2) {
		// 기능 구현
		// 반환타입이 void가 아니면, 반드시 return 으로 결과를 반환해야함
		// void : 단순 기능만 한다면 사용 .
		return 0;
	}
	// 매개변수 : x , 반환값 : o    
	int method2 () {
		return 0;
	}
	// 매개변수 : o , 반환값 : x
	void method3 (int arg1) {           //반환값이 없기에 데이터타입이 없다. 그럴떄 쓰는 것 void
		// void 에서의 return 은 강제로 메서드를 종료하기위해 사용
		return;
	}
	// 매개변수 : x , 반환값 : x
	void method4 () {
		System.out.println(attribute1);
		System.out.println(staticAttribute);
		
		method2();
		staticMethod();	
	}
	
	// 클래스 메서드(스테틱 메서드, 정적 메서드)
	// 모든 인스턴스가 공유하는 메서드
	// 반환타입 앞에 static 키워드를 붙여서 사용
	static void staticMethod() {
		// static 메서드에서는 instance 변수 접근 및 instance 메서드 호출이 불가능
//		System.out.println(attribute1);
		System.out.println(staticAttribute);
		
//		method2();
//		staticMethod();	
	}   // 스테틱 메서드 - 인스턴스 변수 사용 x / 인스턴스 메서드 - 스테틱 변수 x
		
		// 생성자 : 클래스에 인스턴스를 생성하는 순간에 호출되는 메서드
		// 1. 클래스와 같은 이름을 가지고 있다
		// 2. 반환 타입이 존재하지 않음 _ '무조건' 인스턴스를 반환하기 때문에 타입이 존재 x
		// 클래스명 ([매개변수, ...]) {인스턴스가 생성될때 할 작업}
		// 직접 만들어보기! ():메서드이기 때문에
		ExampleClass1 (int attribute1, double arg2) {        // 외부에서 매개변수를 가져와 주입한다.
			System.out.println("ExampleClass1 인스턴스 생성!!");
			// 의존성을 내부에서 주입하는 형태
			// 속성 값이 생성 이전에 결정이 되었기 때문에 코드의 '안정성'이 저하
			// attribute1 = 99;
			// attribute2 = -99.99;  
			
			// 의존성을 외부에서 주입하는 형태
			// 속성 값이 생성 당시에 결정되기 때문에 코드의 '안정성'을 향상
			this.attribute1 = attribute1;
			// this 키워드 : 자기 인스턴스를 지칭
			this.attribute2 = arg2;         // this. : 클래스의 인스턴스를 가르키는 정확한 표현
			// this.staticMethod();
	}
	// 오버로딩: 같은 클래스 내에서 같은 이름의 메서드를 여러개 작성할 수 있도록 하는 방법
	// 오버로딩 조건
	// 1. 메서드 이름을 중복해서 작성하지만 매개변수의 타입 및 개수를 다르게 작성
	// 2. 메서드의 반환타입과 메서드의 매개변수의 이름은 오버로딩에 영향을 미치지 않음
	void overloadMethod() {
		
	}
	
	void overloadMethod(int arg) {
		
	}
	
	void overloadMethod(double arg) {
		
	}
	
	void overloadMethod(int arg1, double arg2) {
		
	}
	
	void overloadMethod(double arg1, int arg2) {
		
	}                      
// ==================== 매개변수의 유무, 타입, 순서 : 오버로딩 O =======================

//	int overloadMethod (double arg1, int arg2) {
//		return 0;
//	}     변환타입을 다르게 하면 오버로딩에 영향 x
	
//	void overloadMethod (double double1, int int1) {    ... 컴파일 오류 >> Duplicate method "overloadMethod(double, int)" in type ExampleClass1
//																" " : 매개변수의 이름은 영향을 미치지 않음	
//	}    매개변수의 이름이 다르면 오버로딩에 영향 x
	
	ExampleClass1() {
		this.attribute1 = 99;
		this.attribute2 = -99.99;
	}
	
	// 생성자도 메서드의 일종이기 때문에 오버로딩이 가능      -- 생성자 내부에서만 부를 수 있다
	ExampleClass1(int attribute1) {
		this(attribute1, -99.99); // <- 생성자 

//		this.attribute1 = attribute1;
//		this.attribute2 = -99.99;
	}




}








// "축구선수"를 정의해보자	(FootballPlayer)

// 이름 				(name - String)
// 포지션 			(position - String)  // 문자열도 가능하고, 숫자도 가능
// 생년월일			(birth - String) 	 // ex_010101(생년월일)이라면, int가 "0"을 표현 X
// 키				(height - double)
// 몸무게				(weight - double)
// 국적				(country - String)
// 주발				(mainFoot - String) 
// 팀				(team - String)
// 골 횟수			(goal - int)
// 어시스트 횟수		(assist - int)
// 경고 				(foul - int)

// 잠자기 		(sleep) - 작업 : "(취침시간) ~ (기상시간)까지 취침" 출력
// 밥먹기			(eat) - 작업 : "(음식) 먹음" 출력
// 훈련하기		(train) - 작업 : "훈련!!" 출력
// 경기결과내기		(setGameResult) - 작업 : 골, 어시스트, 경고수 속성 변경
// 이적하기		(moveTeam) - 작업 : 팀 변경

class FootballPlayerA {
	String name;
	String position;
	String birth;
	double height;
	double weight;
	String country;
	String mainFoot;
	String team;
	int goal;
	int assist;
	int foul;
	
	void sleep (String bedtime, String wakeUpTime) {
		System.out.println(bedtime + "~" + wakeUpTime + "까지 취침");
	}
	void eat (String food) {
		System.out.println(food + "먹음");
	}
	void train() {
		System.out.println("훈련!!");
	}
	void setGameResult (int goalResult, int assistResult, int foulResult) {
		goal += goalResult;
		assist += assistResult;
		foul += foulResult;		
	}
	void moveTeam (String destinationTeam) {
		team = destinationTeam;
	}
	void printInformation() {
		System.out.println("===================================");
		System.out.println(name + "의 정보");
		System.out.println("포지션 : " + position);
		System.out.println("생년월일 : " + birth);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("국적 : " + country);
		System.out.println("주발 " + mainFoot);
		System.out.println("소속팀 : " + team);
		System.out.println("골 : " + goal);
		System.out.println("어시스트 : " + assist);
		System.out.println("파울 : " + foul);
	}
}


public class A_ClassAndObject {
	
//	String team; // 전역변수 (전역 필드)

	public static void main(String[] args) { // main 이라는 단어는 메소드라고해서 메인이라는 기능을 가지고 있다
	
//		String team; // 지역변수 . 같은 코드인데도 색이 다르다(JAVA가 다르게 인식한다) 
		
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화 한 것 (객체)
		// 클래스명 참조변수명 : new 클래스명();
		ExampleClass1 instance1 = new ExampleClass1(0,0);
		ExampleClass1 instance2 = new ExampleClass1(0,0);   
		
		System.out.println(instance1);   // ch02.ExampleClass1@5e91993f : 주소값이 나온다
		System.out.println(instance2);   // ch02.ExampleClass1@6f2b958e : 주소값이 나온다
		
		// 인스턴스가 가지고 있는 속성의 접근 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance1.attribute2 = 3.14;
		System.out.println(instance1.attribute1);  // 결과값 : 10
		System.out.println(instance1.attribute2);  // 결과값 : 3.14
		System.out.println(instance2.attribute1);  // 결과값 : 0
		System.out.println(instance2.attribute2);  // 결과값 : 0.0
		
		// 인스턴스가 가지고 있는 메서드 호출방법
		// 인스턴스.메서드();
		instance1.method1(1, 2);     // 위쪽에 보면 매개변수 : o . 매개변수 필요!
		instance1.method2();
		instance1.method3(1);		 // 위쪽에 보면 매개변수 : o . 매개변수 필요!
		instance1.method4();
		
		// 클래스 만들어보기
		FootballPlayerA SON = new FootballPlayerA();
		FootballPlayerA LEE = new FootballPlayerA();
		
		SON.name = "손흥민";
		SON.position = "공격수";
		SON.birth = "920708";
		SON.height = 183.0;
		SON.weight = 77.0;
		SON.country = "대한민국";
		SON.mainFoot = "오른발";
		SON.team = "토트넘";
		SON.goal = 0;
		SON.assist = 0;
		SON.foul = 0;
		
		LEE.name = "이강인";
		LEE.position = "미드필더";
		LEE.birth = "010219";
		LEE.height = 174.0;
		LEE.weight = 71.0;
		LEE.country = "대한민국";
		LEE.mainFoot = "왼발";
		LEE.team = "파리 생제르맹";
		LEE.goal = 0;
		LEE.assist = 0;
		LEE.foul = 0;
		
		SON.sleep("21:00" , "06:00");   //21:00~06:00까지 취침
		SON.eat("컵라면");				//컵라면먹음
		SON.train();					//훈련!!
		
		SON.setGameResult(1, 1, 0);
		SON.moveTeam("아스날 FC");
		
		System.out.println(SON.name + "의 정보");
		System.out.println("포지션 : " + SON.position);
		System.out.println("생년월일 : " + SON.birth);
		System.out.println("키 : " + SON.height);
		System.out.println("몸무게 : " + SON.weight);
		System.out.println("국적 : " + SON.country);
		System.out.println("주발 " + SON.mainFoot);
		System.out.println("소속팀 : " + SON.team);
		System.out.println("골 : " + SON.goal);
		System.out.println("어시스트 : " + SON.assist);
		System.out.println("파울 : " + SON.foul);
System.out.println("=================================================");
		LEE.setGameResult(1, 2, 1);
		
		System.out.println(LEE.name + "의 정보");
		System.out.println("포지션 : " + LEE.position);
		System.out.println("생년월일 : " + LEE.birth);
		System.out.println("키 : " + LEE.height);
		System.out.println("몸무게 : " + LEE.weight);
		System.out.println("국적 : " + LEE.country);
		System.out.println("주발 " + LEE.mainFoot);
		System.out.println("소속팀 : " + LEE.team);
		System.out.println("골 : " + LEE.goal);
		System.out.println("어시스트 : " + LEE.assist);
		System.out.println("파울 : " + LEE.foul);
	
		LEE.moveTeam("수원 삼성");
		LEE.printInformation();  // 정보를 그대로 가져온다
		
		SON.printInformation();
		
		// static 변수는 클래스로 직접 접근이 가능
		ExampleClass1.staticAttribute = 99;
		// instance 변수와 메서드는 '반드시' 인스턴스를 생성하여 인스턴스로 접근 및 호출
//		ExampleClass1.attribute1 =10;
//		ExampleClass1.method1(0, 0);
		instance1.staticAttribute = 99;    				// The static field ExampleClass1.staticAttribute should be accessed in a static way : 스테틱방법으로 접근하는게 좋습니다
		System.out.println(instance1.staticAttribute);	// >> 클래스로 직접접근 >> "ExampleClass1.staticAttribute" 으로 접근
		System.out.println(instance2.staticAttribute);

		ExampleClass1.staticMethod();
		instance1.staticMethod();
		instance2.staticMethod();
		
		// staticMethod 는 instance 을 호출할 수 없다!
		
		ExampleClass1 instance3 = new ExampleClass1 (99, -99.99);
		System.out.println(instance3.attribute1);		// 99
		System.out.println(instance3.attribute2);		// -99.99
		
		ExampleClass1 instance4 = new ExampleClass1 (999, 99.99);
		System.out.println(instance4.attribute1);
		System.out.println(instance4.attribute2);
		// 결과값은 attribute1 / attribute2 에 의존되어 있는 값으로 동일
//		instance56.attribute1 = 999;
//		instance56.attribute2 = 99.978;		  
		// instance56 값을 바꾸려면, 다시 바꿔주는 작업이 필요
		
		ExampleClass1 instance5 = new ExampleClass1();
		System.out.println(instance5.attribute1);
		System.out.println(instance5.attribute2);
		ExampleClass1 instance6 = new ExampleClass1(100);
		
		
		
		// 캡슐화 예제
//		son // 이거만 보고서는 데이터가 변경이 되었는지 안 되었는지 "알 수 없음" 상태이다.
			// 캡슐화는 변경 자체를 막아버리는 '데이터 보호의 역할'을 한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
