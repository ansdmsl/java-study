package custom_Exception;

import custom_Exception.exception.TempOutOfRangeException;
import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooRowException;

public class App {

	public static void main(String[] args) throws Exception {
		//����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-1);
		} catch (TempTooHighException e) {
			// �µ��� ������� ó���ڵ� 
			System.out.println(e.getMessage());
		}catch (TempTooRowException e) {
			// �µ��� ������� ó���ڵ� 
			System.out.println(e.getMessage());
		}
	}

	}


