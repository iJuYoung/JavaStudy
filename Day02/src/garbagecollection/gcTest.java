package garbagecollection;

public class gcTest {
	public static void main(String[] args) throws Exception{
		GarbageCollector test2;
		
		for(int i=0;i<5;i++) {
			GarbageCollector test = new GarbageCollector(i);//스택이 아니라 힙으로 만들어주겠다는 뜻. 
			
			if(i == 3) {
				test2 = test;
			}
			
			test = null;
		}
		
		System.gc();
		Thread.sleep(1000);
	}
}
