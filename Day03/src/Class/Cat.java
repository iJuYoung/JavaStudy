package Class;

public class Cat {
	
	public String name;
	public int age;
	public String kind;
	public String color;
	
	
	//클래스 내부의 멤버함수는 static을 붙이지 않는다. 
	//변수와 메소드가 같은소속이므로, 래퍼런스 주소를 붙이지 않는다. 
	public void showCatInfo() {
		System.out.println("고양이의 이름 : "+name);
		System.out.println("고양이의 나이 : "+age);
		System.out.println("고양이의 품종 : "+kind);
		System.out.println("고양이의 색상 : "+color+"\n");
	}

}