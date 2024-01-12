package inheritance;

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

	
	//파라미터로 모든 몬스터의 부모터압안 Monster 인스턴스를 요구하면, 다형성의 원리에 의해서 상속받ㅇㄴ 모든 몬스터를 다 대입할 수 있다. 
	//-> Monster 클래스를 상속받은 Rabbit도 Monster monster 에 대입할 수 있다는 듯 
	
	public void hunt(Monster monster) {
		if(monster.getHp()<=0) {
			System.out.println(monster.getName()+"은 이미 죽어서 교전할 수 없습니다. ");
			return;
		}
		//when Monster died by next atk
		if(monster.getHp() - (this.atk - monster.getDef())<=0) {
			//gave experience
			monster.setHp(0);
			System.out.println(monster.getName()+"이(가) 죽었습니다. ");
			this.exp+=monster.getExp();
		}
		//when monster didn't die after worrier's atk
		else {
			//monster's hp -= (worrier's atk - monster's def)
			//worrier's hp -= (monster's atk - worrier's def)
			
			monster.setHp(this.atk - monster.getDef());
			this.hp-=monster.getAtk() - this.def;
			System.out.println(monster.getName()+"이(가) 반격했습니다. ");
		}
	}
	
	
	
}
