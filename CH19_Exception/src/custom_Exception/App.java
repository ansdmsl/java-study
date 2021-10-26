package custom_Exception;

import custom_Exception.exception.TempOutOfRangeException;
import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooRowException;

public class App {

	public static void main(String[] args) throws Exception {
		//예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-1);
		} catch (TempTooHighException e) {
			// 온도가 낮을경우 처리코드 
			System.out.println(e.getMessage());
		}catch (TempTooRowException e) {
			// 온도가 높은경우 처리코드 
			System.out.println(e.getMessage());
		}
	}

	}


