package noinheri;

public class Worrier {
	
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	
	public Worrier(String id) {
		this.id = id;
		hp = 20;
		atk = 3;
		def = 1;
		exp = 0;
		
	}
	
	
	
	public void showStatus() {
		System.out.println("아이디 : "+this.id);
		System.out.println("체력 : "+this.hp);
		System.out.println("공격력 : "+this.atk);
		System.out.println("방어력 : "+this.def);
		System.out.println("경험치 : "+this.exp);
		System.out.println("-----------------------");
	}

	
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp()<=0) {
			System.out.println("이미 죽은 토끼입니다.");
			return;
		}
		
		rabbit.setHp(rabbit.getHp()-this.atk);
		
		if(rabbit.getHp()<=0) {
			System.out.println("토끼를 죽였슴니다. ");
			this.exp+=5;
		}else {
			System.out.println("토끼를 공격했습니다. ");
		}
	}
	
	public void huntRat(Rat rat) {
		if(rat.getHp()<=0) {
			System.out.println("이미 죽은 쥐입니다.");
			return;
		}
		
		rat.setHp(rat.getHp()-this.atk);
		
		if(rat.getHp()<=0) {
			System.out.println("쥐를 죽였슴니다. ");
			this.exp+=5;
		}else {
			System.out.println("쥐를 공격했습니다. ");
		}
	}
	
	
	
}