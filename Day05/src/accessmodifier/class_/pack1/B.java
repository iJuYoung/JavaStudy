package accessmodifier.class_.pack1;

//public 접근제한자는 어디서든 접근이 가능하다. 
public class B {
	
	//클래스 A의 접근제한자가 default이기 때문에 같은 패키지 내부인 B에서 A를 선언할 수 있다. 
	A a = new A();//<-여기서는 선언이라도 가느했는데, 다른 패키지인 c에서는 아예 선언조차 못하게 막는다는 차이점이 있음. 

}
