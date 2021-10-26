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
		//이 메소드는 자동으로 시작 및 수정시 자신의 모습을그린다. 
		Graphics2D g2 = (Graphics2D) g; //2d그래픽을  사용하기 위해 

		int width = getWidth(); // 가로길이 
		int height = getHeight(); // 세로길이 

		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;
		
		g2.setColor(backgroundColor); //색설정 
		g2.fillRect(0, 0, width, height);	 //사각형 좌표에 색을 칠한 

		drawGrid(g2, width, height); // 줄긋는 메소드 ]
		
		fillCell(g2, 0, 0, true); //첫번째 줄, 첫번째 열, 녹색
		fillCell(g2, 0, 2, true);
		fillCell(g2, 3, 4, true);
		
		
	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status)  {
		// 사각형에 색을 넣는 메소드 (그래픽객체, 가로줄, 세로줄, 상태(true녹색,false배경색)
		Color color = status ? Color.GREEN : backgroundColor; // 삼항연산자 STATUS가 true면 녹색
		g2.setColor(color);
		
		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);
		
		g2.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);
		
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		//격자 줄을 긋는 메소드 
		
		g2.setColor(gridColor); //색절성 : 검정색
		
		for(int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			//중을 긋는 메소드 (x1,y1) (x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for(int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			//중을 긋는 메소드 (x1,y1) (x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
	}
		
	}