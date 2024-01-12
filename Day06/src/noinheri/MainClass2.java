package noinheri;

public class MainClass2 {

	public static void main(String[] args) {
		//전사 생성
		Worrier w1 = new Worrier("케인");
		//상태 조회
		w1.showStatus();
		//쥐 생성
		Rat r1 = new Rat();
		//쥐와 교전(3번)
		w1.huntRat(r1);
		w1.huntRat(r1);
		w1.huntRat(r1);
		//상태 조회
		w1.showStatus();
		
		

	}

}
