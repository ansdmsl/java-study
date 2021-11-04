package stream_example;

import java.util.stream.IntStream;

public class Int_stream {

	public static void main(String[] args) {
		// 정수형 스트림 intstream
		IntStream
		.range(1, 10)   //1~10사이 정수
		.skip(5)		// 5개 아이템 스킵(넘김)
		.forEach(x -> System.out.println(x));
	// @formatter:on
	
	System.out.println();
	
	int val = IntStream.range(1, 5).sum(); // max , min, avg , count
	System.out.println(val);
			

	}

}
