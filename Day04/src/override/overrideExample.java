package override;

public class overrideExample {

	public static void main(String[] args) {
		//프로그래머 클래스의 인스턴스 생성
		//해당 인스턴스에 값 대입
		//자기소개 & 코딩 시키기
		
		
		Programmer p = new Programmer();
		
		p.name = "성예은";
		p.age = 25;
		p.DevLang = "Java";
		p.repoCnt = 5;
		
		p.자기소개하기();
		p.코딩하기();

	}

}
