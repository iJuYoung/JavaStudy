package equals.str;

public class UserMain {

	public static void main(String[] args) {
		String s1 = "estelle";
		String s2 = "estelle";
		System.out.println(s1 == s2);
		
		String s3 = new String("estelle");
		
		System.out.println(s1+s2+s3);
		System.out.println(s1==s3);//false. 주소의 동등성을 따짐. 자료는 동등하지만 주소가 동등하지 못해서, 동등성은 있지만 동일성은 없다.
		System.out.println(s1.equals(s3));//true. 자료의 동등성을 따짐. 
	}
}