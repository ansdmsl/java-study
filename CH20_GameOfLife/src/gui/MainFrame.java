package application;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	
	public MainFrame() {
		super("Game of Life");//타이틀명
		
		setLayout(new BorderLayout());// 레이아웃 구역 설정
		add(gamePanel, BorderLayout.CENTER);// 게임패널을 가운데 
		
		
		setSize(800, 600);//창사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫을떄 프로그램ㅈ ㅗㅇ료 
		setVisible(true);//보이게하기
	
	
	}

}