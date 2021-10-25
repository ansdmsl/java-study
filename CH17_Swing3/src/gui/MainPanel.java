package gui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

public class MainPanel extends JPanel implements ColorChangeListener{
	private static final long serialVersionUID = 1L;
	
	public MainPanel() {
		setBackground(Color.GREEN);
	}

	@Override
	public void changeColor(Color color) {
		
		setBackground(color);//배경색바꾸기 추상메소드 changeColor a완성
	}
	


}