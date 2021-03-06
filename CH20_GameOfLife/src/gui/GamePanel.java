package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import model.World;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 50; //격자의 크리설정 
 
	private final static Color backgroundColor = Color.BLACK; // 배경색 검은색
	
	private final static Color gridColor = Color.GRAY; // 격자선색 회색

	private int topBottomMargin; // 위 아래 마진 
	private int leftRightMargin; // 왼쪽 오른쪽 모진 
	private World world;

	public GamePanel() {
	 //setBackground(Color.BLUE); 게임패널생성시 색을 파란색

			//게임패널을 생성시에 이벤트중(마우스 이벤트 추가)
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				if(e.getY() < topBottomMargin || e.getX() < leftRightMargin) {
					return;// 벗어난 값이기 때문에 그냥 리턴 (작은값)
					
				}
				
				int row = (e.getY() - topBottomMargin)/CELLSIZE;
				int col = (e.getX() - leftRightMargin)/CELLSIZE;
				
				if(row >= world.getRows() || col >= world.getColumns()) {
					return; //벗어난 값이기 때문에 그냥 리턴
		}
				
				boolean status = world.getCell(row, col);
				world.setCell(row, col, !status);//현재 녹색인지 체크해서 반전

				repaint(); // 새로고침(게임패널을 새로시작)
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		//이 메소드는 자동으로 시작 및 수정시 자신의 모습을그린다. 
		Graphics2D g2 = (Graphics2D) g; //2d그래픽을  사용하기 위해 

		int width = getWidth(); // 가로길이 
		int height = getHeight(); // 세로길이 

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;
		
		int rows = (height - 2 * topBottomMargin) / CELLSIZE;
		int cols = (width - 2 * leftRightMargin) / CELLSIZE;
		
		if(world == null) {  // 아직 world가 생성되지 않았으면 새로 생성
			world = new World(rows, cols);
			} else {
				if(world.getRows() != rows|| world.getColumns()!= cols) {
					world = new World(rows, cols);
				}
			}
		
		
//		System.out.println(rows);
//		System.out.println(cols);
		
		//World world = new World(rows, cols);
		
//		world.setCell(0, 0, true); //GRID 이중배열에 좌표(줄, 열)

		g2.setColor(backgroundColor); //색설정 
		g2.fillRect(0, 0, width, height);	 //사각형 좌표에 색을 칠한 

		drawGrid(g2, width, height); // 줄긋는 메소드 ]
		
		///전체 그리드 배열에서현재 값으로 색을 넣는다.
		for(int col=0;col<cols; col++) {
			for(int row=0; row<rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2, row, col, status);
			}
		
	}
}
	private void fillCell(Graphics2D g2, int row, int col, boolean status)  {
		// 사각형에 색을 넣는 메소드 (그래픽객체, 가로줄, 세로줄, 상태(true녹색,false배경색)
		Color color = status ? Color.GREEN : backgroundColor; // 삼항연산자 STATUS가 true면 녹색
		g2.setColor(color);
		
		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);
		
		// x,y좌표 가로 세로 길이 입력해서 사각형에 색을 칠한다.
		g2.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);
		
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
	
	public void randomize() {
		world.randomize();
		repaint();	
	}

	public void clear() {
		world.clear();
		repaint();	
	}

	public void next() {
		// TODO Auto-generated method stub
		world.next();
		repaint();	
	}
		
	}