package throwing_Runtime_Exception;

public class Thermostat {
	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}
	
	private void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상 입니다.");
		}
	}
	
}
