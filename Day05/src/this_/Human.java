package this_;

public class Human {
	
	public int age;
	public String name;
	
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human(String name) {
		this(name, 0);
	}
	public Human() {
		this("이름 없음", -1);
		this.age = -1;
		this.name = "이름 없음";
	}
	
	
	public void showInfo() {
		System.out.println("이름 : "+this.name+"\n 나이 : "+this.age);
	}

}
