package accessmodifier.class_.pack2;
import accessmodifier.class_.pack1.B;

public class C {
	
	//class B는 접근제한자가 public이라 패키지가 달라도 생성이 가능하다. 
	B b = new B();
	
	//클래스 A는 default 접근제한자이므로 다른 패키지 내에서는 호출이 불가능하다. 
	//A a = new A();

}
