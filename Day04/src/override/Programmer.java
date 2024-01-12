package override;

public class Programmer extends Human {
		
	String DevLang;
	public int repoCnt;
	
	
	@Override
	//이 어노테이션 안붙여도되긴 하는데, 그럼 오버라이딩이 안되고 그냥 다른 함수인거임. Human의 자기소개()랑 Programmer의 자기소개()가 따로 만들어진거. 유지보수 측면에서 이게 유리함. 
	//오버라이드가 됐는지 안됐는지 체킹하기 좋음. 
	
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("사용가능 개발언어 : " + DevLang);
		System.out.println("레포지토리 갯수 : " + repoCnt);
	}
	
	public void 코딩하기() {
		System.out.println(DevLang+"으로 프로그램을 제작합니다. ");
	}
}

