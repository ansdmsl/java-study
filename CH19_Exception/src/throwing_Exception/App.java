package throwing_Exception;

public class App {

	public static void main(String[] args) throws Exception {
		//����ó���� �ѱ�
			Thermostat stat = new Thermostat();
			
			//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���ҋ� ó���ؾ��Ѵ�.
			//try cathc�� �ٷ� ó��, throw�� �ѱ�
			stat.setTemperature(60);
		}

	}


