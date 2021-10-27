package reading_writing_txt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App2 {

	public static void main(String[] args) throws IOException {
		//파일의 절대경로를 문자열로 표시(\\)
		String fileLocation = "E:\\JAVA\\java-study\\CH21_Reading_Writing\\text.txt";
		System.out.println(new File(fileLocation).exists());
	}
}

