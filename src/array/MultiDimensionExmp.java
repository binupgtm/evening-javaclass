package array;

public class MultiDimensionExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][]matrix=new int[3][3];
//		matrix[0][0]=100;
//		matrix[0][1]=200;
//		matrix[0][2]=300;
//		matrix[1][0]=400;
//		matrix[1][1]=500;
//		matrix[1][2]=600; 
//		matrix[2][0]=700;
//		matrix[2][1]=800;
//		matrix[2][2]=900;
		
		int [][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(matrix[i][j]);
			}
		}
		

	}

}
