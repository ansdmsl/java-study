package throwing_Exception2;

public class Thermostat {
	public void setTemperature(double temperature) throws Exception {
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}
	
	private void setMachineTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다.");
		}
	}
	
}
