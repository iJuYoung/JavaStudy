package casting;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("자식이 재정의한 부모측의 2번 함수를 보여드립니다. ");
	}
	
	public void method3() {
		System.out.println("자식만이 가지고있는 3번 함수입니다. ");
	}
}
