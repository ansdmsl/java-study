package throwing_Runtime_Exception;

public class Thermostat {
	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature);
	}
	
	private void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("�µ��� ������ �Դϴ�.");
		}
	}
	
}
