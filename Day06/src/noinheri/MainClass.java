package noinheri;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Worrier w1 = new Worrier("리눅스 개발");
		w1.showStatus();
		
		Rabbit r1 = new Rabbit();
		Rat rat = new Rat();
		w1.huntRabbit(r1);
		w1.huntRabbit(r1);
		
		w1.showStatus();

	}

}
