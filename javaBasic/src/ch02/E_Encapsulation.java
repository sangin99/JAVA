package ch02;

// 캡슐화 : 멤버변수(=일반적 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, ★데이터 무결성★을 보장할 수 있음 -- +무결성 : 변경되지 않는다. 데이터가 정확하다
// private - 접근제어자 : 데이터 보호 . 초기화 x 
class FootballPlayerB{
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerB (String name, String birth, String team, int goal) {
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName () {
		return this.name;
	}
	String getBirth () {
		return this.birth;
	}
	String getTeam () {
		return this.team;
	}
	int getGoal () {
		return this.goal;             // get 메서드 : 필드의 변환타입과 같이 한다. get필드명 / 매개변수 필요 x
	}
	
	// 작업 중에 변경을 해야하는 경우가 발생했을 때 변경만을 위한 메서드
	// set 메서드 : 결과 x . 반환은 필요없고, 매개변수만 받아오면 됨 . set필드명 = 변경할 내용(매개변수명) 
	void setName (String name) {
		this.name = name;
	}
	void setTeam (String team) {
		this.team = team;
	}
	void setGoal (int goal) {
		if (goal < 0) return;
		this.goal = goal;
	}
}                                   // getBirth : 생일은 절대! 바뀌지 않기 때문에 setter 사용 x
//=======================================================================================================================
class FootballPlayersC {

	private String name;
	private String birth;
	private String team;
	private int goal;

FootballPlayersC(String name, String birth, String team, int goal) {
		super();   // ?? Object 에 대한 생성자가 자동으로 만들어진거임 / 지워도 됨
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}


String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getTeam() {
		return team;
	}

	void setTeam(String team) {
		this.team = team;
	}

	int getGoal() {
		return goal;
	}

	void setGoal(int goal) {
		this.goal = goal;
	}

	String getBirth() {
		return birth;
	}
	
}
//====================================================================================

public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민" , "920000" ,"토트넘훗스퍼" , 0);
//		son.name = "손흥민";
//		son.team = "토트넘 훗스퍼";
//		son.goal =0;              -- 접근제어자를 사용함으로 필요없어짐
//		...[]
		
		son.setGoal(-1);   // 윗줄에서 if (goal < 0) return; 선언을 했기 때문에 데이터가 들어가지 않고 종료!
		
//		System.out.println(son.name);  - 100% 데이터 추출 확실/"손흥민" , "토트넘훗스퍼" , 0
		System.out.println(son.getName());  //-- 초기값에서 변경되지 않았음을 100% 무결성보장 

	}

}
