package ch02;

// GalaxyPhone
// 제조사 : (maker - String)
// 모델명 : (modelName - String)
// 소유자 : (owner - String)
// 전화번호 : (telNumber - String)
// 전원상태 : (power - boolean)

// 전원버틈누름 : onPower - power 상태를 '부정'으로 지정
// 전화걸기 : call - power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기 : emergency - "112로 전화를 겁니다." 출력
// 휴대전화정보보기 : getInformation - power가 true일 때

// ======(전화번호)======
// 제조사 : (제조사)
// 모델명 : (모델명)
// 소유자 : (소유자)
//
// 출력

class GalaxyPhone {    		// 속성과 상태를 나타냄 . 인스턴스변수임 =
							// 를 붙여서 사용할 수 있게 만드는게 인스턴스임 s23,s24 으로 인스턴스를 만듦 * s23 maker를 삼성으로 전체지정을 하면서 s24  
							
	static String maker;	
	String modelName;
	String owner;
	String telNumber;
	boolean power;             // OK! // 
	
	void onPower () {
		power = !power;        // !:부정연산자
	}
	void call (String toTelNumber) {
		if (power)  // if : ~ 일 때 , ~ 이면 
		System.out.println(toTelNumber + "로 전화를 겁니다." );
	}
	static void emergency () {
		System.out.println("112로 전화를 겁니다.");
	}
	void getInformation() {
		if (power) {
		System.out.println("======" + telNumber + "=======");
		System.out.println("제조사 : " + maker);
		System.out.println("모델명 : " + modelName);
		System.out.println("소유자 : " + owner);
		}
		
		// power가 true일 때 : 그러나, power가 false일 때 >> " if (!power) return; " : 종료코드 
	}
}
//===============================================================================================
// ## Drama - 드라마 클래스 만들기 ##

// 방송사 : (boardcastingCompany - String)
// 제목 : (title - String)
// 배우 : (actors - String[]) - 문자열의 배열로 잡음   
// 장르 : (genre - String)
// 시청률 : (viewerRating - double) 
// 부작 : (series - int)

// 정보보기 : getInformation
// ===== (title) =====
// 방송사 : (boardcastingCompany)
// 장르 : (genre)
// 부작 : (series)부작
// 시청률 : (viewerRating)%
// 배우 : (actor), (actor), (actor) ...   []     ... ?? 

class Drama {
	
	String boardcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;
	int series;	
	
	void getInformation() {          							// 내부에서 처리 가능하기에 void
		System.out.println("===== " + title + " =====");
		System.out.println("방송사 : " + boardcastingCompany);
		System.out.println("장르 : " + genre);
		System.out.println("부작 : " + series + "부작");
		System.out.println("시청률 : " + viewerRating + "%");            // OK
		System.out.println("배우 : ");
		for (int index = 0; index < actors.length; index++) {
//			System.out.print(actors[index] + ", ");   		// [index] 뒤에 (+ ", ") 마지막 배우까지 ,가 찍히는 (실수)
			// ex) {A, B, C} B까지만 , 표시
// 방법 1		if (index < actors.length-1) System.out.println(", ");  
			// index의 성격 : index 0 = []한 칸을 의미  .. 그러므로 index 1 = A, B, 가 되는 것이다. 그래서 -1 을 대입!
			// foreach (X) 복사가 안되는 성격
			
			// index < actors.length-1
			// true -> actors[index] + ", " / false -> actors[index]
			System.out.print(index < actors.length-1 ?  actors[index] + ", " :  actors[index]);  // 방법 2
		}
		System.out.println("");  // 줄바꿈
	}	
}          // 인스턴스 만들기 완료! : 독립적인 요소로 존재
//=======================================================================================================
			// 실체 만들기 작업

public class A_Example {

	public static void main(String[] args) {
//		new GalaxyPhone();   //인스턴스 생성하는 구문!
		
		GalaxyPhone S23 = new GalaxyPhone();	
		GalaxyPhone S24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";                // static 를 사용함으로 모든 GalaxyPhone 의 maker 는 "LG"가 된다
		
		
//		S23.maker = "SAMSUNG";
		S23.modelName = "s23";
		S23.owner = "홀길동";
		S23.telNumber = "010-1234-1234";
		S23.power = false;
		
//		S24.maker = "SAMSUNG";
		S24.modelName = "s23";
		S24.owner = "김철수";
		S24.telNumber = "010-45325-4124";
		S24.power = false;
		
		S23.onPower();           // 파워를 킨다" 는 구문
		S23.getInformation();
		
		GalaxyPhone.emergency();
		S23.emergency();
		S24.emergency();

		
//\//\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
		Drama star = new Drama();
		star.boardcastingCompany = "SBS";
		star.title ="별그대";
		star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"};
		star.genre = "로맨스";
		star.viewerRating = 28.1;
		star.series = 21;
		
		star.getInformation();
		
//		star.serie; // 변수
//		star.getInformation();  // 메서드 : ()의 유무
		
		//=========================================================//
//*** 예제 ***						-- 인스턴스 메서드
	// TriangleMath (삼각함수)
	// 빗변 구하기 - getHypotenuse
	// 둘레 구하기 - getCircumference 	
	// sin 구하기 - getSin
	// cos 구하기 - getCos
	// tan 구하기 - getTan
	
	class TriangleMath {
		
//		 static final double PI = 3.14;
		
		static double getHypotenuse (int bottom, int height) {
			if (bottom <= 0 || height <= 0) return 0;
//			if (!(bottom > 0 && height > 0))		 = 같은 의미
				
//			double result = (bottom * bottom) + (height * height);       // 제곱 표현
			double result = Math.pow(bottom, 2) + Math.pow(height, 2);   // Math.pow : 제곱
			return Math.sqrt(result);									 // Math.sqrt : 제곱근
		}
		
		static double getCircumference (int height, int bottom, int hypotenuse) {
			if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
			return height + bottom + hypotenuse;
		}
		
		static double getSin(int height, int hypotenuse) {
			if (height <= 0 || height <= 0) return 0;
			return height / hypotenuse;	
		}
		
		static double getCos(int bottom, int hypotenuse) {
			if (bottom <= 0 || hypotenuse <= 0) return 0;
			return bottom / hypotenuse;
		}
		
		static double getTan(int height, int bottom) {
			if (bottom <= 0 || height <= 0) return 0;
			return height / bottom;
		}
	}
		TriangleMath triangleMath = new TriangleMath();
		double bit = TriangleMath.getHypotenuse(3, 4);
		System.out.println(bit);
		
//		System.out.println(TriangleMath.PI);
//		TriangleMath.PI = 0.0;            -- 단일책임원칙

//		static : 
		
	
//		static double getCircumference (int height, int bottom, int hypotenuse) {
//			if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
//			return height + bottom + hypotenuse;
//			
//		static double getCircumference (double height, double bottom, double hypotenuse) {
//			if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
//			return height + bottom + hypotenuse;
		
		// >> 오버로딩 예시 구문 : 타입이 달라도 (int . double) 전혀 문제가 없다. 알아서 오버로딩 해줌 java 에서
	
	
	
	
	
	
	
	}

}

