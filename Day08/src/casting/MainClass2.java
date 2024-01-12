package casting;

public class MainClass2 {

	public static void main(String[] args) {
		// Parent 타입에는 Child1, Child2 다 대입이 가능하다. 
		Parent p1 = new Child();
		p1.method2();
		//p1.method3();
		/*Parent 타입으로는 
		 * Child1 의 메소드2도, Child2의 method2도 호출이 가능하다. 
		 * method2는 Parent 에도 정의되어있지만, Child 와 Child2에도 정의된 오버하이딩 메서드이기 때문에 호출 가능하다. 
		 */
		
		
	}

}
