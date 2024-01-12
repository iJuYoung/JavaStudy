package overload;

public class Cat {

	public String name ;
	public String kind;
	
	
	public Cat() {
		call();
	}
	
	public Cat(String k, String n) {
		kind = k;
		name = n;
		System.out.println("지금부터 이 아이의 이름은 "+n+"입니다. ");
		call(n);
		
	}
	
	public void call() {
		System.out.println("야옹아 이리와");
		
	}
	
	public void call(String n) {
		System.out.println(n + "아 이리와");
	}
}
