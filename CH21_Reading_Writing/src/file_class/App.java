package file_class;

import java.io.File;

public class App {

	public static void main(String[] args) {
	File currentDirectory = new File("test");
		
		System.out.println(currentDirectory.getAbsolutePath()); //������(����������Ʈ��������)
		//�������� ���� ���ϵ��� �̸� ��� 
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}

	}

}
