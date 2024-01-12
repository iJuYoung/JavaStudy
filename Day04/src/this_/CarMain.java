package this_;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car("어쩌구");
		Car yourCar = new Car("저쩌구");
		
		for(int i=0;i<20;i++) {
			myCar.accel();
		}
		
		myCar.showStatus();
		
		yourCar.accel();
		yourCar.showStatus();
		
	}

}
