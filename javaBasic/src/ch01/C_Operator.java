package ch01;

import java.util.Scanner;

public class C_Operator {

	public static void main(String[] args) {
		
		// 연산자
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
		int intResult;
		double doubleResult;
//======================================================		
		// 산술 연산자 : 사칙연산 작업 숫자 데이터에 대해서 연산을 수행
//======================================================
		// 더하기 : +
		// : 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		doubleResult = c + d;
		
		doubleResult = a + b;          // double로 자동형변환이 되었다
		intResult = (int) (c + d);     // (int) 형 변환이 필요
		
		// 정수 + 실수 = 실수
        // ( intResult = a + d; ) : 정수 + 실수 = 실수가 나오기 때문에 int에 담을 수 없다
		doubleResult = a + d;
	//=================================
		// 빼기 : -
		// 좌항에 우항을 뺸 결과를 반환
		intResult = a - b;
		doubleResult = c - d;
		
		// 정수 - 실수 = 실수
		doubleResult = a - d;
	//=================================
		// 곱하기 : *
		// 좌항에 우항을 곱한 결과를 반환
		intResult = a * b;
		doubleResult = c * d;
		
		// 정수 * 실수 = 실수
		doubleResult = a * d;
	//=================================
		// 나누기 : /
		// 좌항에 우항을 나눈 결과를 반환
		// 정수 나누기 정수의 결과는 실수부가 버려짐
		intResult = a / b;
		System.out.println(intResult);  // 반환값 : 2 (실수는 날아가고, 정수만 표현)
		doubleResult = c / d;
		System.out.println(doubleResult);  // 반환값 : 2.142857142857143
		doubleResult = a / d;
		System.out.println(doubleResult);  // 반환값 : 2.142857142857143 
	//==================================
		// 나머지 : %
		// 좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		doubleResult = c % d;
	//==================================
		// 증감 연산자
		// 피연산자의 값을 1 증가 혹은 감소
		// 증가 연산자 : ++ 
		// 감소 연산자 : --
		int number = 8;
		intResult = ++number + 2;  // 결과값 : 11
		intResult = number++ + 2;  // 결과값 : 10
		System.out.println(intResult);
//===========================================================
		// 대입 연산자 : 좌항에 우항을 할당 = 할당 연산자
//===========================================================
		// 일반 대입 연산자 : =
		// 상수에 초기화를 할때를 제외하고 좌항이 반드시 변수이어야 함
		// 좌항에 우항을 할당
		number = 10;
	//=======================
		// 복합 대입 연산자 : 산술연산=
		// 좌항에 사용되는 변수는 반드시 초기화가 되어있어야 함
		    // int number1;
			// number1 += 10;
		// 좌항에는 변경 가능한 일반 변수가 와야함 (상수 불가능)
		// 좌항에 우항을 연산한 결과를 좌항에 할당
		number += 10;   // 결과값 : 20  / 10 + 10
		number -=  7;   // 결과값 : 13  / 20 - 7
		number *= (7 - 5);   // 결과값 : 26  / (7-5)*13 
//=============================================================
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리값으로 반환
		boolean booleanResult;
//=============================================================
		// 같다 , 다르다 연산
		// == : 좌항과 우항이 같으면 true, 다르면 false
		// != : 좌항과 우항이 다르면 true, 같으면 false
		booleanResult = a == b;
		System.out.println(booleanResult);
		booleanResult = c != b;
		System.out.println(booleanResult);
		
		String string = "Hello";
		booleanResult = string == "Hello";
		System.out.println(booleanResult);       
	//=========================================
		// 작다, 작거나 같다 연산
		// < : 좌항이 우항보다 작으면 true, 같거나 크면 false
		// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < b;
		System.out.println(booleanResult);    // 결과값 : false
		booleanResult = a <= c;
		System.out.println(booleanResult);    // 결과값 : true
	//=========================================
		// 크다, 크거나 같다 연산
		// > : 좌항이 우항보다 크면 true, 같거나 작으면 false
		// >= : 좌항이 우항보다 크거나 작으면 true, 작으면 false
		booleanResult = a > c;
		System.out.println(booleanResult);   // 결과값 : false
		booleanResult = a >= c;
		System.out.println(booleanResult);   // 결과값 : true
//==========================================================================
		// 논리 연산자 : 피연산자가 모두 논리형태로 논리 값을 조합하는 것   **사용빈도 높다!
//==========================================================================
		// && : AND 연산 - 좌항과 우항이 모두 true이면 true, 하나라도 false면 false
		booleanResult = true && true;
		System.out.println(booleanResult);
		booleanResult = false && false;
		System.out.println(booleanResult);
		
		booleanResult = a > b && c > d;
		System.out.println(booleanResult);  // 결과값 : true
		booleanResult = a < b && c > d;
		System.out.println(booleanResult);  // 결과값 : false
	//=======================================
		// || : OR 연산 - 좌항과 우항 중 하나라고 true면 true, 모두 false면 false
		booleanResult = true || true;
		System.out.println(booleanResult);
		booleanResult = a < b || c > d;
		System.out.println(booleanResult);  // 결과값 : true
		
		// 증명식 (false && ___ : 무조건 false / true || ____ : 무조건 true)
		// a :  15, b : 7
		booleanResult = (a < b) && (a > ++b);
		System.out.println(booleanResult);       // 결과값 : false
		System.out.println(b);                   // 결과값 : 7
		
		booleanResult = (a > b) || (a > ++b);
		System.out.println(booleanResult);
		System.out.println(b);
		
/////     /////     /////     /////     /////    24.01.22
		
//=======================================
		// 삼항 연산자 : 간단한 조건을 따라 결과를 반환하는 연산자
//=========================================
		// 조건(논리식) ? 참일때결과 : 거짓일때결과
		Scanner scanner = new Scanner(System.in);
	    System.out.print("나이 : ");
		
		int age = scanner.nextInt();
		
		String stringResult = age > 19 ? "성인" : "미성년자";
		System.out.println(stringResult);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
 






















