package ch02_sub;

public interface G_Message {

	public static final String GREETING_MESSAGE = "반갑습니다.";
	public static final String GOODBYE_MESSAGE = "수고하셨습니다.";

	
//	public abstract void method1 ();
//	public abstract void method2 ();  
	// public interface G_Method 에 꺼를 한 공간에 선언 | 다이아몬드 문제발생 우려
	
	// >> SOLID 원칙 > 인터페이스 분리 원칙
	
	// 현재 이 인터페이스는 너무 많은 책임을 가진 인터페이스이다 그러면, 그 클래스가 필요하지 않은 메서드에도 영향을 받게 되는 문제가 발생한다.


}
