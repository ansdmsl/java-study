package throwing_Runtime_Exception;

public class App {

	public static void main(String[] args) throws Exception {
		//����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(60);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	}


