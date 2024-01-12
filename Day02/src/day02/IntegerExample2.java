package day02;

public class IntegerExample2 {
	public static void main(String[] args) {
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		//int형 자료형 범위를 넘어가는 변수는 뒤에 L을 붙이면 long타입으로 변환된다. 
		 long d = 2147483648L;
		 
		 
		 //2진수를 표현하고 싶다면 넘버 앞에 접두어로 0b를 붙임. 
		 int bin = 0b1010;
		 System.out.println(bin);
		 
		 
		 //8진수를 표현하려면 접두어로 0을 왼쪽에
		 int oct = 064;
		 System.out.println(oct);
		 
		 //16진수 표현하려면 접두어로 0x;
		 int hex = 0x3a4c;
		 System.out.println(hex);
		 
	}
}
