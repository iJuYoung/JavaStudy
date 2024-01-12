package garbagecollection;

public class GarbageCollector {
		//생성자(객체가 힙에서 생성될 떄 호출되는 메소드)
	public int objectNum;
	
	
	
	
	public GarbageCollector(int number) {
		objectNum = number;
		System.out.println(objectNum+"번 객체 생성");
	}
	
	
	//소멸자. 자바에서는 잘 안씀. 알아서 해주니까. 
	@Override
	protected void finalize() throws Throwable{
		System.out.println(objectNum+"번 객체 힙에서 delete");
	}
}


