package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game Of Life");//Ÿ��Ʋ��
		
		setLayout(new BorderLayout()); //���̾ƿ� ��������
		add(gamePanel, BorderLayout.CENTER); //���� �г��� ���
				
		addKeyListener(new KeyAdapter() { //Ű �̺�Ʈ 
			public void keyPressed(KeyEvent e) {
				//System.out.println("Ű������!");
				int code = e.getKeyCode();
				
				switch(code) {
				case 32:
					//System.out.println("�����̽���");
					gamePanel.next(); //�����̽���
					
					break;
				case 8:
					//System.out.println("�� �����̽�");
			
					gamePanel.clear(); //�������̽�
					break;
				case 10:
					//System.out.println("����");
					gamePanel.randomize();
					break;
			}			
			
			}
		});
		setSize( 800, 600); //â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ������ ���α׷� ����			
		setVisible(true); //���̰� �ϱ�	
	}
			
	}


	