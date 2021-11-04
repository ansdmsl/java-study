package stream_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// ���ڿ��� �迭 ��Ʈ��
			
			Stream.of("Hello", "bottole", "Africa")
				.sorted()  //����:���ĺ���
				.findFirst()   //ù��°
				.ifPresent((x) -> System.out.println(x));
			
			System.out.println();
			
			String[] items = {"ġŲ","������","����","ġ��","����","ġ��","�����"};
			Stream.of(items)
				.filter((x) -> x.startsWith("ġ"))
				.sorted()
				.forEach(x -> System.out.print(x + ","));	
			
			System.out.println();
			System.out.println();
			
			Arrays.stream(new int[] {2,4,6,8,10}) //���� �迭�� new�� ������ ���ÿ� �ʱ�ȭ
			.map( x -> x*x)  //����
			.average()		 //���
			.ifPresent(n -> System.out.print(n)); //���

	         System.out.println();

	         //�迭�� ����Ʈ�� �ٲ٤Ѥ� ��� arrays,asLit(�迭)
			List<String> listItems = Arrays.asList(items);
			listItems.stream()
				.filter( x -> x.startsWith("��"))
				.sorted()
				.forEach(x -> System.out.print(x + ","));
			
			//�迭�� stram.of(�迭) ,t��Ƽ������, ����Ʈ stream(����)
			//filter(x->����_) ������ ���̸� ����� �ƴϸ� ����
			// map(x -> ���ϰ� ) ������ ���� ���Ͱ����ιٲ� 
			
			
		}

}
