package instanceof_;

public class Human {
	
	private String name;
	private int age;
	
	//생성자 만들기
	//name, age를 파라미터로 전달받아 초기화
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//만약 void 파라미터로 생성자 호출 시
	//"naname", 0을 이름과 나이로 초기화하는 생성자를 정의
	public Human() {
		//this("noname",0);//이러고 해도 됨. 
		name = "noname";
		age = 0;
	}
	
	public void showInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("==================");
	}

}
