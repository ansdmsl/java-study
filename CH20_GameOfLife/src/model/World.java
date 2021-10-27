package model;

import java.util.Random;

public class World {
	private int rows; //줄
	private int columns; //열
	
	private boolean[][] grid; // 불린 이중배열 
	private boolean[][] buffer;//버퍼임시배열
	
	public World(int rows, int columns) { // 얼드 생성자 (가로,세로)
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns]; // 이중배열 객체 만들기(크기 설정)
		buffer = new boolean[rows][columns]; //버퍼임시배열
	}
	
	public boolean getCell(int row, int col) {
		return grid[row][col]; //월드의 grid에서 현재 셀(사각형)이 녹생인지 검은색인지?
	}
	
	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status; //t셀의 상태를 성정(셋)
	}

	public int getRows() {
		return rows; // 만들어진 배열의 줄수를 리턴 
	}

	public int getColumns() {
		return columns; // 만들어진 배열의 열수를 리터
	}

	public void randomize() {
	 //그리드 배열에 랜뎜으로 true false 넣기
		Random random = new Random();
		for( int i =0;i < (rows  * columns) / 10; i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);
			setCell(row, col, true);
		}
	}
		public void clear() {
			// 백스페이스 눌었을때 모든 셀을 false로 검은색
			for(int row=0; row < rows ; row++) {
				for(int col=0; col < columns ; col++) {
					setCell(row, col, false);
	}
}
		}

		public void next() {
			// TODO Auto-generated method stub
			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < columns; col++) {
					int neighbours = countNeighbours(row, col);
					System.out.printf("( %d , %d ) %d\n", row, col, neighbours);
					/*
					 * 주위 셀 녹색 개수 < 2, 검은색 주위 셀 녹색 개수 > 3, 검은색 주위 셀 녹색 개수 == 3, 녹색으로 바꿈 주위 셀 녹색 개수
					 * == 2, 그대로
					 */
					boolean status = false;

					if (neighbours < 2) {
						status = false;
					} else if (neighbours > 3) {
						status = false;
					} else if (neighbours == 3) {
						status = true;
					} else if (neighbours == 2) {
						status = getCell(row, col);
					}

					buffer[row][col] = status;
				}
			}
			//버퍼에 적용된 값을그대로 현재 grid 배열에 카피 
			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < columns; col++) {
					grid[row][col] = buffer[row][col];
				}
			}

		}
			
		
		private int countNeighbours(int row, int col) {

			int n= 0;

			for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
				for (int colOffset = -1; colOffset <= 1; colOffset++) {

					if (rowOffset == 0 && colOffset == 0) {
						continue;
					}

					int gridRow = row + rowOffset;
					int gridCol = col + colOffset;

					if (gridRow < 0) {
						continue;
					} else if (gridRow == rows) {
						continue;
					}

					if (gridCol < 0) {
						continue;
					} else if (gridCol == columns) {
						continue;
					}

					boolean status = getCell(gridRow, gridCol);

					if (status) {
						n++;
					}
				}
			}

			return n;
		}
				
		
		}
			

