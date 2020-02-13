package array;

public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix =new int[3][3];
		matrix[0][0]=5;
		matrix[0][1]=10;
		matrix[0][2]=15;
		matrix[1][0]=20;
		matrix[1][1]=25;
		matrix[1][2]=30;
		matrix[2][0]=35;
		matrix[2][1]=40;
		matrix[2][2]=45;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(matrix[i][j]);
			}
		}
		
	}

}
