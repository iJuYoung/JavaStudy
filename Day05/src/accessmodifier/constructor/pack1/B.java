package accessmodifier.constructor.pack1;

public class B {

	A a1 = new A(false);
	A a2 = new A(55);
	//A a3 = new A("안녕하세요");//내부의 요소가 아니라 private 요소 호출 불가능.
}
