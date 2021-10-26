package custom_Exception;

import custom_Exception.exception.TempOutOfRangeException;
import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooRowException;


public class Thermostat {
	public void setTemperature(double temperature)  throws TempTooRowException, TempTooHighException  {
		
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature);//�µ��� ������ ��� ���
	}
	
	private void setMachineTemperature(double temperature) throws TempTooRowException, TempTooHighException  {
		if(temperature < 0 ) {
			//�µ����� ���������� ���ܼ� ����ó���Ѵ� throw�� �ܿ��ܸ����߿� ó��(�� �޼ҵ带 ȣ���Ҷ�ó��)
			throw new TempTooRowException("�µ��� �ʹ� �����ϴ�.");//���ܸ����� 
		}
		else if (temperature > 35) {
			throw new TempTooHighException("�µ��� �ʹ� �����ϴ�..");//���ܸ����� 
			
		}
	}
	
}
