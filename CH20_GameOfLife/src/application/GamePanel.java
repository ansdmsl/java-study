package application;

import javax.swing.*;
import java.awt.*;


import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 50;

	private final static Color backgroundColor = Color.BLACK;
	
	private final static Color gridColor = Color.GRAY;

	private int topBottomMargin;
	private int leftRightMargin;

	public GamePanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		//�� �޼ҵ�� �ڵ����� ���� �� ������ �ڽ��� ������׸���. 
		Graphics2D g2 = (Graphics2D) g; //2d�׷�����  ����ϱ� ���� 

		int width = getWidth(); // ���α��� 
		int height = getHeight(); // ���α��� 

		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;
		
		g2.setColor(backgroundColor); //������ 
		g2.fillRect(0, 0, width, height);	 //�簢�� ��ǥ�� ���� ĥ�� 

		drawGrid(g2, width, height); // �ٱߴ� �޼ҵ� ]
		
		fillCell(g2, 0, 0, true); //ù��° ��, ù��° ��, ���
		fillCell(g2, 0, 2, true);
		fillCell(g2, 3, 4, true);
		
		
	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status)  {
		// �簢���� ���� �ִ� �޼ҵ� (�׷��Ȱ�ü, ������, ������, ����(true���,false����)
		Color color = status ? Color.GREEN : backgroundColor; // ���׿����� STATUS�� true�� ���
		g2.setColor(color);
		
		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);
		
		g2.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);
		
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		//���� ���� �ߴ� �޼ҵ� 
		
		g2.setColor(gridColor); //������ : ������
		
		for(int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			//���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for(int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			//���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
	}
		
	}