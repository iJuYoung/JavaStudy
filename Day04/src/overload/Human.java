package overload;

public class Human {
	
	public String name;
	public int age;
	
	public Human() {//void 파라미터. 아무것도 매개변수로 받지 않는 기본생성자란 뜻임 
		name = "이름을 입력하지 않았습니다.";
		age = 0;	

	}
	
	public Human(String n, int a) {
		name = n;
		age = a;
	}
	

}
