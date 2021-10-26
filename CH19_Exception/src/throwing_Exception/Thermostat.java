package throwing_Exception;

public class Thermostat {
public void setTemperature(double temperature) throws Exception  {
		
		if(temperature < 0 || temperature > 35) {
			//온도값이 비정상으로 여겨서 예외처리한다 throw는 단예외를나중에 처리(이 메소드를 호출할때처리)
			
			//
			throw new Exception("온도가 비정상 입니다.");//예외를생성
		}
		
		
		System.out.println("온도 세팅 : " + temperature);//온도가 정상일경우 
	}
}
