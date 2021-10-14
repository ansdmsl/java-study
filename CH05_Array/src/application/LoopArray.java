package application;

public class LoopArray {

	public static void main(String[] args) {
		// for 반복문과 문자열 인덱스 i를 사용해 배열의 첫번쨰 부터 끝까지 출력
		String[] animals = {"개","고양이","닭"};
		for(int i=0; i <animals.length; i++) {
			System.out.println(animals[i]);
		}
	}

}
