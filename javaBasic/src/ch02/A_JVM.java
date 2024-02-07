package ch02;
class ExampleClass2 {
	
	static int number = 3;
	double doubleNumber;

//	void method(Sample1 arg) {
//		arg.data++;
//		System.out.println("method in : " + arg.data);
		
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}

	static void staticMethod() {
		
	}
}

class Sample1 {
	int data;

	Sample1 () {}

	Sample1 (Sample1 sample) {
		this.data = sample.data;
	}
}



public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 0;
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
//		instance1.method(sample);
		sample = instance1.method();
									// method 종료
		System.out.println(sample.data);      
		
		
		// 기본형 데이터 타입 - 원본이 같이 없어지고,
		// 참조형 데이터 타입 - 힙 영역에 복사가 되고, 원본은 유지
		
		// 참조변수를 만들면, 다른 공간에 만들어진다 
		// 스택 영역에는 주소가 들어간다.
		// *** 참조변수에는 다른 공간에서 만들어진 주소가 들어간다 ***

		
		int number2 = number;       // 현재 number = 0 이기 때문에 number2 = 0
		number2++;					// 1
		System.out.println(number);
		System.out.println(number2);     // 복사된 녀석이 들어갔기때문에 결과는 0 / 1 
		
		Sample1 sample2 = sample;       // -456
		sample2.data++;					//  sample2가 바뀌고, 힙 영역에 영향을 미치니깐 -455
		System.out.println(sample.data);
		System.out.println(sample2.data);     // 주소가 복사된 상황
		
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data);
		System.out.println(sample3.data);        // 데이터가 힙 영역으로 이동하면 데이터 종료!
		
		sample3.data++;
		System.out.println(sample.data);      // -455
		System.out.println(sample3.data);     // -454
	//============================================================================

		
		
	}

}