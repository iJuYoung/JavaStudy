package inheritance;

public class MainClass1 {

	public static void main(String[] args) {
		// create worrier
		Worrier worrier = new Worrier("밀리온즈 나이브스");
		
		// showStatus
		worrier.showStatus();
		// create Rabbit
		Rabbit rabbit = new Rabbit();
		// fight twice at worrier
		worrier.hunt(rabbit);
		worrier.hunt(rabbit);
		// show status
		worrier.showStatus();
		
		//create rat
		Rat rat = new Rat();
		
		worrier.showStatus();
		
		worrier.hunt(rat);
		worrier.hunt(rat);
		
		worrier.showStatus();
		
		//create ghost
		Ghost ghost = new Ghost();
		
		worrier.hunt(ghost);
		worrier.hunt(ghost);
		
		worrier.showStatus();
		

	}

}
