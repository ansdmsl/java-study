package reading_lineByline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {

		String fileLocaiton = "D:\\Java11\\workspace-java\\CH21_Reading_Writing\\text2.txt";
		System.out.println(new File(fileLocaiton).exists());
		System.out.println();


		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileLocaiton))){
			br.write("������");
			br.newLine();
			br.write("����");
			
		} catch (IOException e) {
			System.out.println("������ ���� ���� : "+ fileLocaiton);
		}
		System.out.println("���� ���� �Ϸ� : "+ fileLocaiton);
	}
}