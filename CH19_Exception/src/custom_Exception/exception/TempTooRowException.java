package custom_Exception.exception;
//�µ��� �ʹ� ������� �߻���ų ����
public class TempTooRowException  extends TempOutOfRangeException{
	private static final long serialVersionUID = 1L;
	
	public TempTooRowException(String message) {
		//������ ���� �޼����� ���� ����ũ������ ó�� 
		super(message);//����Ŭ�������� �޼��������� ���ܸ����� 
		//TempTooHighException
	}
	
}
