package stream_example;

import java.util.stream.IntStream;

public class Int_stream {

	public static void main(String[] args) {
		// ������ ��Ʈ�� intstream
		IntStream
		.range(1, 10)   //1~10���� ����
		.skip(5)		// 5�� ������ ��ŵ(�ѱ�)
		.forEach(x -> System.out.println(x));
	// @formatter:on
	
	System.out.println();
	
	int val = IntStream.range(1, 5).sum(); // max , min, avg , count
	System.out.println(val);
			

	}

}
