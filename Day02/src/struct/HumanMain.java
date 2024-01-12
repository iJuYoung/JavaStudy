package struct;

public class HumanMain {
	public static void main(String[] args) {
		Human h1=new Human();
		
		h1.name = "이주영";
		h1.age = 25;
		h1.height = 159;
		
		
		System.out.println("Human1 : " + h1.name);
		System.out.println("Human1's addr : "+ h1);
		
		Human h2=new Human();
		
		h2.name = "Lee Juyoung";
		h2.age = 27;
		h2.height = 172;
		
		
		System.out.println("Human2 : " + h2.name);
		System.out.println("Human2's addr : "+ h2);
	}
}
