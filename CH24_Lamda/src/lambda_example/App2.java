package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


interface Runner{
	void execute();
	
}


public class App2 {
	public static void main(String[] args) {
		//���� �Լ��� �������̽��� �������ٽ� ��� 
		//1. �Լ��� �������̽�(�޼ҵ尡`1���϶�) ��밣�� 
		//2. �߻�޼ҵ��� ���Ͱ��� �Ű������� Ȯ���ϰ� �����Ѵ�/
		
		Runner run = () -> System.out.println("��ο�!");
		run.execute();
		
		
}
}