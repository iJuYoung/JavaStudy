package accessmodifier.constructor.pack1;

public class A {

	
	A a1 = new A(true);//public 생성자 호출
	
	A a2 = new A(3);//default 생성자 호출
	
	A a3 = new A("hi");//private 생성자 호출
	
	//생성자들 선언하기
	public A(boolean a) {}//public 생성자의 파라미터는 boolean 값
	A(int i){}//default 생성자는 int 파라미터를 가짐
	private A(String s) {}//private 생성자는 String 파라미터. 
	
}
