package accessmodifier.member.pack2;

import accessmodifier.member.pack1.a;


public class C {
	public C() {
		a A = new a();
		
		A.a = 1;
		//A.b = 1;
		//A.c = 1;
		
		A.method1();
		//A.method2();
		//A.method3();
	}

}