package hetero;

public class MainClass {

	public static void main(String[] args) {
		//기본형으로 만든 자료형 예시
		// 다른 자료형을 넣을 수는 없다. 
		
		//int[] iArr = {1,2,3,4,5};//<-이렇게. int형으로 만들어진 자료형에 String을 넣을 수는 없다. 
		
		
		A[] aArr = new A[2];
		
		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		
		//모든 클래스의 부모클래스인 Object 배열을 선언하면 다형성 원리(부모객체를 요구하는 자리에 자식타입 대입 가능함)에 의해 모든 자료를 다 대입할 수 있따. 
		Object[] oArr = new Object[2];
		
		
		B b1 = new B();
		oArr[0] = b1;
		oArr[1] = a2;
		
		oArr[1] = 100;//Object 배열은 기본형 자료도 대입 가능하다. 

	}

}
