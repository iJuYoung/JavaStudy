package instanceof_;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("김자바",20);
		h1.showInfo();
		
		Student s1 = new Student("태국인",19);
		s1.showInfo();
		
		Cat c1 = new Cat("룰루",6);
		c1.meow();
		
		System.out.println(h1 instanceof Human);//h1이 human 기반인가?
		System.out.println(s1 instanceof Human);//s1이 Human 기반인가?
		//System.out.println(s1 instanceof Cat);//관련 없는 객체간의 비교는 에러가 남. 
	}

}
