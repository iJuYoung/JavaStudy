package super_;

public class SupersonicAirplane extends Airplane{

	
	//생성자는 상속이 안돼서 부모생성자를 먼저 초기화 해주고 나머지 코드를 실행해야함. 
	public SupersonicAirplane(String planeCode) {
		super(planeCode);
		
	}

	@Override
	public void fly() {
		if(this.speed<900) {
			super.fly();
		}else if(this.speed+300<=2200&&this.gas>=5) {
			this.speed+=300;
			this.gas-=5;
		}else if(this.speed+300>=2200&&this.gas>=5) {
			this.speed = 2200;
			this.gas-=5;
		}else {
			System.out.println("연료가 부족합니다.");
		}
	}
	
}
