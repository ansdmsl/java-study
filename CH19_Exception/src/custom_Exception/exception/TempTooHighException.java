package custom_Exception.exception;
//�µ��� �ʹ� ������� �߻���ų ����
public class TempTooHighException  extends TempOutOfRangeException{
	private static final long serialVersionUID = 1L;
	
	public TempTooHighException(String message) {
		//������ ���� �޼����� ���� ����ũ������ ó�� 
		super(message);//����Ŭ�������� �޼��������� ���ܸ����� 
		//TempTooHighException
	}
	
}
