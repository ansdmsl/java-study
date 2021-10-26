package custom_Exception;

import custom_Exception.exception.TempOutOfRangeException;
import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooRowException;


public class Thermostat {
	public void setTemperature(double temperature)  throws TempTooRowException, TempTooHighException  {
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);//온도가 정상일 경우 출력
	}
	
	private void setMachineTemperature(double temperature) throws TempTooRowException, TempTooHighException  {
		if(temperature < 0 ) {
			//온도값이 비정상으로 여겨서 예외처리한다 throw는 단예외를나중에 처리(이 메소드를 호출할때처리)
			throw new TempTooRowException("온도가 너무 낮습니다.");//예외를생성 
		}
		else if (temperature > 35) {
			throw new TempTooHighException("온도가 너무 높습니다..");//예외를생성 
			
		}
	}
	
}
