package custom_Exception.exception;
//�µ��� ���ų� �Ǵ� �ʹ� ������� �߻��ϴ� ������ ���� Ŭ����
public class TempOutOfRangeException  extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String message) {
		//������ ���� �޼����� ���� ����ũ������ ó�� 
		super(message);//����Ŭ�������� �޼��������� ���ܸ����� 
		
	}
	
}
