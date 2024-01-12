package super_;

public class Airplane {
	
	public String planeCode;
	public int gas;
	protected int speed;
	
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	
	public void fly() {
		if(this.gas<3) {
			System.out.println("연료가 부족합니다. ");
		}
		if(this.speed+100>=900) {
			this.speed = 900;
			this.gas-=3;
			return;
		}
		this.speed+=100;
		this.gas-=3;
	}
	
	public void showStatus() {
		System.out.println("편명 : "+this.planeCode);
		System.out.println("속력 : "+this.speed);
		System.out.println("연료 : "+this.gas);
	}

}
