package inheritance;

public class Monster {

	
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	
	//부모쪽 생성자로 초기화할 때 어떤 몬스터가 생성될 지 사전에 알 수 없으므로 고정값이 아닌 자식 쪽에서 입력받은 자룔ㄹ 대입하도록 생성자 설계
	public Monster(String name, int hp, int atk, int def, int exp) {
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	
}
