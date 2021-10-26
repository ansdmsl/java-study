package custom_Exception.exception;
//온도가 너무 낮을경우 발생시킬 예외
public class TempTooRowException  extends TempOutOfRangeException{
	private static final long serialVersionUID = 1L;
	
	public TempTooRowException(String message) {
		//생성자 예외 메세지를 상위 예외크래스에 처리 
		super(message);//예외클래스에서 메세지명으로 예외를생성 
		//TempTooHighException
	}
	
}
