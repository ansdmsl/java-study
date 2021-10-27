package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game Of Life");//타이틀명
		
		setLayout(new BorderLayout()); //레이아웃 구역설정
		add(gamePanel, BorderLayout.CENTER); //게임 패널을 가운데
				
		addKeyListener(new KeyAdapter() { //키 이벤트 
			public void keyPressed(KeyEvent e) {
				//System.out.println("키눌렀음!");
				int code = e.getKeyCode();
				
				switch(code) {
				case 32:
					//System.out.println("스페이스바");
					gamePanel.next(); //스페이스바
					
					break;
				case 8:
					//System.out.println("백 스페이스");
			
					gamePanel.clear(); //벡스페이스
					break;
				case 10:
					//System.out.println("엔터");
					gamePanel.randomize();
					break;
			}			
			
			}
		});
		setSize( 800, 600); //창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫을때 프로그램 종료			
		setVisible(true); //보이게 하기	
	}
			
	}


	