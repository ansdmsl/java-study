package example;

public class Split_String {
	public static void main(String[] args) {
		// ���ڿ�.split(" ") => ���ڿ��� ����(space)�� �ɰ��� �迭�� ����
		String text1 = "When? Joe. Manchin, stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "�������൵ �ֱ� ��� ��ݸ� ���� ��ǰ�� �յ��� �����̰� �ִ�. IBK��������� ��IBK ���佺 ���ݡ��� ����ߴ�. ���佺�豸���� ������� 2021~2022 V-���ס� ������ ���� ���ݸ��� �����ϴ� ���������� ��ǰ�̴�. ���Ⱓ�� 1���̸� �� �ִ� 50�������� ������ �����ϰ� �������� 5���� �������� �Ǹŵȴ�. ��ǰ�� �⺻�ݸ��� �� 1.00%�� ���ݸ� �ִ� �� 2.00%����Ʈ�� ������ �ְ�ݸ��� �� 3.00%��.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //����ǥ����[] ^���۹���
		String[] words = text2.split("[^��-�R]+");
		
		
		for(String w : words) {
			
			if(w.length()<2) continue; //�� ö�����ϴ� ����
			
			System.out.println(w.toLowerCase()); //���� �ҹ��ڷ� ���
		}
	}

}