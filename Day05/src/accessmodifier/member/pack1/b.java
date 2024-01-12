package accessmodifier.member.pack1;

public class b {
	
	
	public b() {
		a A = new a();
		
		A.a=1;//public 접근가능
		A.b=1;//같은 패키지 내에 있으면 default 접근 가능
		//A.c=1;//private 은 아예 불가능. 
		
		
		A.method1();
		A.method2();
		//A.method3();
	}

}
