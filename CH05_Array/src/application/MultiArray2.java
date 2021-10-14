package application;

public class MultiArray2 {

	public static void main(String[] args) {
		// 이주배열 
		int sum1=0;
		int[][] values = {
				{1,5,7},
				{9,6,4},
				{2,4,6},
				};
			
		for(int i=0;i<values.length;i++) {
				for(int j=0;j<values[i].length; j++) {
					sum1 += values[i][j];
				}		
	}System.out.println("총합은 " + sum1);


	}

}
