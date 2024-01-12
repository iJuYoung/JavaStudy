package Class;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c1 = new Cat();
		c1.name = "스톨라스";
		c1.age = 5;
		c1.kind = "올빼미";
		c1.color = "쿠앤크";
		
		Cat c2 = new Cat();
		c2.name = "블리초";
		c2.age = 5;
		c2.kind = "임프";
		c2.color = "빨간색";
		
		c1.showCatInfo();
		c2.showCatInfo();
	}

}
