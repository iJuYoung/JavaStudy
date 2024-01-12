package Encapsulation.bad;

public class MyBirthday {

	public int year;
	public int month;
	public int day;

	//alt+shift+s 혹은 마우스 우클릭->source->generate constructor using fields 선택
	public MyBirthday(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	void showDateInfo() {
		System.out.println("내 생일은 ");
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 입니다. ");
		
	}
}
