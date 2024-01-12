package casting;

public class MainClass1 {

	public static void main(String[] args) {
		Parent p = new Child();//1. 좌변에는 부모, 우변에는 자식이 들어가야 함. 2. 공통적으로 overriding 된 함수가 있어야 함. 
		
		p.method1();//parent 에만 정의된 메소드
		p.method2();//오버라이딩 된 메소드는 상관없이 인스턴스 내 자식 쪽을 호출
		//p.method3();//p 타입 변수로는 자식 쪽에만 정의된 요소는 호출 불가능. 
		System.out.println("-------------------------------------");
		
		
		Child c = (Child)p;
		c.method3();//형변환 후에는 자식쪽에만 있는 메소드도 호출이 가능하다. 
		c.method2();//형변환 후에도 자식쪽 메소드가 호출된다. 
		
		
		Child cc = new Child();//아예 자식 타입으로 대입 시도
		cc.method3();//자식쪽에만 있는 요소 호출 가능. 
		

	}

}
