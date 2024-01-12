package overload;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Human 클래스 기본생성자
		//매개변수생성자 (String, int )
		
		Human h1 = new Human();
		Human h2 = new Human("이주영",25);
		
		System.out.println("h1 : "+h1.name+" "+h1.age);
		System.out.println("h2 : "+h2.name+" "+h2.age);

	}

}
