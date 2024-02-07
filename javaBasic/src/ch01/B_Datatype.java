package ch01;

public class B_Datatype {

	public static void main(String[] args) {
		
		//===================
		// 기본형 데이터 타입
		//===================
		// 정수형 데이터 타입 : 실수부가 없는 정수를 나타냄
		
		// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		byte byte1 = 127;
		// byte byte2 = 128;
		
		// short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ 32767
		short short1 = 32767;
		// short short2 = 32768;
		
		// int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2147483648 ~ 2147483647
		int int1 = 2_147_483_647;  // 수를 나눌 때 "," 같은 의미 "_" 활용
		// int int2 = 2_147_483_648;
		
		// long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 2_147_483_648L;   // long은 수 뒤에 "L"을 적어야한다
		
		//=================================================================
		
		// 실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		// float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6-7 자리에서 오차가 발생
		float float1 = 3.1415926535f;
		System.out.println(float1);
		
		// double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15-17 자리에서 오차가 발생
		double double1 = 3.1415926535;
		System.out.println(double1);
		
		//==================================================================
		
		// 문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		// char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입     -- 'short'와 참고 . 문자에서는 부호를 지정필요 x
		// 0 ~ 65535
		// 문자를 나타내는 것이기에 '하나'만 지정 . aa 처럼 2개를 사용하면 오류발생
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
		//==================================================================
		
		// 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		// boolean " 1byte(8bit)의 크기를 가진 논리형 데이터 타입
		// true, false
		// true : 1 / false : 0
		boolean boolean1 = true;
		boolean boolean2 = false;
		//(*)실무에서 사용빈도가 많다!                                                             
		
		//=========================================
		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		//=========================================
		// 자동 형변환 (묵시적 형변환) : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		int number = 10;
		long longNumber = number;
		
		//==================================================================
		
		// 강제 형변환 (명시적 형변환) : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 닮을 때 발생
		// 할당 하고자 하는 큰 데이터 타입 변수 앞에 (작은 데이터타입)을 붙여줌
		// number = longNumber;      // 4byte <= 8byte - 불가
		number = (int)longNumber;    // (int)사용
		
		number = 128;
		byte byteNumber = (byte) number;
		System.out.println(byteNumber);    //결과값이 -128..? = 데이터 손실 // (byte)의 표현 범위를 참고
		
		// * 같은 사이즈 다른 타입 *
		short shortNumber = 97;    
		char character = 97;
		// shortNumber = character;  >> 부호비트를 사용하냐 안 하냐의 차이
		
		int intNumber = 100;
		float floatNumber = 100;
		// intNumber = floatNumber;  >> 실수부와 정수부 
		// tip! 보통 실무에서는 자동 상관없이 명시적형변환 사용!
		
		//========================================
		// 배열 : 동일한 타입의 변수를 묶어 저장하는 컨테이너
		//========================================
		// new 연산자를 이용해서 '생성'을 해야함  / 선언 > 생성
		// 한번 생성된 배열의 크기는 변경할 수 없음
		// 선언
		// : 데이터타입[] 변수명(배열명);
		// 생성
		// : 변수명 = new 데이터타입[크기];
		int[] numbers;
		numbers = new int[5];
		System.out.println(numbers);
		
		// 배열의 초기값 지정
		int[] numbers2 = {1, 2, 3, 4, 5};      
		int[] numbers3 = new int[] {1, 2, 3, 4, 5};    // 선언과 동시에 생성 / **'new'이용하면 주소가 만들어진다! . 참조형데이터 타입
		System.out.println(numbers2);
		System.out.println(numbers3);
	
		//======================================================================
		// 인덱스 = 색인 = 경계부분을 의미 -> 0인덱스 = 0~1부분을 취한다
		// 인덱스 : 배열의 요소에 접근할 때 사용
		// 인덱스는 0번부터 시작. 마지막 인덱스는 길이 -1번
		int item = numbers2[0];
		System.out.println(item);
		item = numbers[0];
		System.out.println(item);
		numbers[0] = 99;
		System.out.println(item);
		item = numbers[0];
		System.out.println(item);
		
		System.out.println(numbers[0]);
		
	
		// 인덱스 범위를 초과하는 인덱스에 접근할 시 예외발생문
		// System.out.println(numbers[5]);    // 예외 발생 - 길이가 5이고, 인덱스가 4이기 때문에 .. 문법에 오류는 없으나, 예외는 발생
		
		// numbers : {99, 0, 0, 0, 0}  x / [I@36aa7bc2 o => 실제는 숫자가 아니라 주소가 들어있는 것이다
		System.out.println(numbers);   
		
		numbers2 = numbers;
		// number2 : {99, 0, 0, 0, 0}  x / [I@36aa7bc2 o
		
		numbers[4] = -99;
		// numbers : {99, 0, 0, 0, -99}
		// numbers2 : {99, 0, 0, 0, -99}         --> 같은 곳을 바로보고 있다
//		System.out.println(numbers2[4]);         --> 참조형 데이터 타입에서는 '주소'가 들어가져있다     *****중요
		
// 		int number1 = 0;
//      int number2 = number1;
//      number1 = -99;
//      System.out.println(number1);
//      System.out.println(number2);
		
		char[] chars1 = {'a', 'p', 'p', 'l', 'e'};   // 문자열 - 다소 귀찮다는 단점..
		System.out.println(chars1);
		
		// String : 문자열을 표현하는데 사용되는 참조형 데이터 타입
		// 문자열을 다루는데 유용한 여러가지 기능을 제공해주고 있음
		String string1 = "apple";                    // 위에 예제 "char[] ~~" 와 같은 의미
		
		// String의 주요 기능
		String statement = "  My name is ironman  ";
		
		// 1. 문자열 결합
		// + 혹은 concat(문자열)으로 두 문자열을 열결 가능
		System.out.println(statement + "!!!");
		System.out.println(statement.concat("???"));
		
		// 2. 문자열 비교
		// equals(문자열) : 두 문자열이 동등한지 비교
		// compareTo(문자열) : 두 문자열을 사전순으로 비교(=오름차순 비교)
		// compareToIgnoreCase(문자열) : 대소문자 구분없이 사전순으로 비교
		System.out.println(statement.equals("My name is ironman"));
		System.out.println(statement.compareTo("apple"));               // 아스키코드 상으로 대문자가 소문자보다 먼저 온다
		System.out.println(statement.compareToIgnoreCase("apple"));
		
		// 3. 문자열 길이
		// length() : 문자열의 길이를 변환
		System.out.println(statement.length() );
		
		// 4. 문자열 변환
		// toUpperCase() : 모든 문자를 대문자로 변환
		// toLowerCase() : 모든 문자를 소문자로 변환
		// trim() : 문자열의 앞뒤 공백을 모두 제거
		System.out.println(statement.toUpperCase()  );
		System.out.println(statement.toLowerCase()  );
		System.out.println(statement.trim()   );
		
		// 5. 문자열 찾기                                                          *****중요
		// indexOf(문자열) : 찾고자하는 문자열의 처음찾은 위치를 인덱스 번호를 반환
		// lastIndexOf(문자열) : 찾고자하는 문자열의 마지막으로 찾은 위치의 인덱스 번호를 반환
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그름은 잘못 그린 기린 그림이다.";
		System.out.println(statement.indexOf("그림")  );
		System.out.println(statement.indexOf("하마")  );            // 문장에 존재하지 않는다 = "-1"
		System.out.println(statement.lastIndexOf("그림") );
		System.out.println(statement.lastIndexOf("하마") );         // 문장에 존재하지 않는다 = "-1"
		
		// 6. 부분 문자열
		// substring(시작인덱스), substring(시작인덱스, 종료인덱스) : 문자열을 원하는 크기만큼 추출
		System.out.println(statement.substring(48) );
		System.out.println(statement.substring(3, 10) );
//====================================================
		// null : 아직 어떠한 값도 지정되지 않은 상태 / 참조형 타입에만 가능문법              *****중요
		String string2 = null;
		System.out.println(string2.substring(48) );
	
	}

}



























