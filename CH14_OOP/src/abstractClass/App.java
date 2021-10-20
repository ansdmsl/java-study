package abstractClass;

import javax.print.attribute.standard.JobHoldUntil;

public class App {

	public static void main(String[] args) {
		GameObject[] objs = { new Player(), new Monster()};
		for(GameObject obj : objs) {
			System.out.println(obj);
			obj.describe();
			
			//GameObject go = new GameObject(); 푸상클래스는 객체를 못만든다다
		}

	}

}
