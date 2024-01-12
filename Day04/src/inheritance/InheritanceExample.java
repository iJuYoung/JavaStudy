package inheritance;

public class InheritanceExample {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "이주영";
		s1.age = 25;
		s1.major = "Information Security";
		
		
		SalesMan s2 = new SalesMan();
		
		s2.name = "안영선";
		s2.age = 35;
		s2.Salary= 6000;
		System.out.println("\n");
	}

}
