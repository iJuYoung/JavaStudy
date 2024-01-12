package Encapsulation.good;

public class MyBirthday {

	private int year;
	private int month;
	private int day;

	//alt+shift+s 혹은 마우스 우클릭->source->generate constructor using fields 선택
	public MyBirthday(int year, int month, int day) {
		this.year = year;//refactoring : 기능은 유지하면서 코드의 구조를 유지보수하기 좋게 개선하는 것. (기능을 유지한 채로 
		setMonth(month);
		setDay(day);
	}

	
	//은닉된 변수에 접근하기 위해서는 클래스 설계 시 미리 설정해 둔 setter, getter 메소드를 이용해 데이터에 접근해야 한다. 
	
	
	//setter 메소드 선언. 
	//1. setter 메소드는 은닉 겂을 저장하기 위해 선언한다. 
	//2. 메서드의 접근제한자는 public 으로 설정하고 이름은 일반적으로 set+변수명으로 설정한다. 
	
	public void setMonth(int month) {
		if(month<1||month>12) {
			this.month = 1;
		}else {
			this.month = month;
		}
	}
	public void setDay(int day) {
		if(day<1||day>31) {
			this.day = 1;
		}else {
				this.day = day;
		}
	}
	void showDateInfo() {
		System.out.println("내 생일은 ");
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 입니다. ");
		
	}
}
