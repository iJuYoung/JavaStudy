package Class;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		BasketballPlayer bsPlayer = new BasketballPlayer();

		bsPlayer.name = "안영진";
		bsPlayer.height = 172;
		bsPlayer.age = 32;
		bsPlayer.salary = 4500;
		bsPlayer.showInfo();
		bsPlayer.dunkShoot();
		
		
		
		BasketballPlayer bsPlayer2 = new BasketballPlayer();

		bsPlayer2.name = "김민지";
		bsPlayer2.height = 191;
		bsPlayer2.age = 36;
		bsPlayer2.salary = 5100;
		bsPlayer2.showInfo();
		bsPlayer2.dunkShoot();
		
	}

}
