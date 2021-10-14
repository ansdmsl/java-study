package returnValues;

public class App {

	public static void main(String[] args) {
		returnValue value1 = new returnValue();

		System.out.println(value1.getAnimal());
		String ani = value1.getAnimal();
		System.out.println(ani);
	}

}
