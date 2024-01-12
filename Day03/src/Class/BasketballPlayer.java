package Class;

public class BasketballPlayer {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	//이름, 키, 나이, 연봉
	
	public BasketballPlayer() {//<-파스칼컨벤션(생성자 만들 때 많이 씀)
		//기본생성자
		
	}
	
	public void showInfo() {
		System.out.println("선수 이름 : "+name);
		System.out.println("선수 키 : "+height);
		System.out.println("선수 나이 : "+age);
		System.out.println("선수 연봉 : "+salary);
	}
	
	
	public void dunkShoot() {
		//덩크슛기능
		if(height>190) {
			System.out.println("succeed!");
		}
		else {
			System.out.println("닿지도 않았네용");
		}
	}
	
	

}
