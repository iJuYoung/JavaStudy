package super__;
import super_.SupersonicAirplane;

public class AirplaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane("KE101");
		
		for(int i=0;i<8;i++) {
			sa.fly();
		}
		
		
		sa.showStatus();
		
		
		for(int i=0;i<4;i++) {
			sa.fly();
		}
		sa.showStatus();
	}

}
