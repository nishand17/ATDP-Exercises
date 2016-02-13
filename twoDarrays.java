/** Write a method that will multiply together two x by y matrices (as defined below) with integer entries and print the resulting products to the screen, making use of nested for loops.

  int[][] matrixA = { { 1, 0, 1 },
                      { 1, 2, 3 },
                      { 1, 4, 5 } };

  int[][] matrixB = { { 5, 4, 0 },
                      { 4, 8, 1 },
                      { 1, 1, 0 } };
					  5*1 = 5, 0*4 = 4, 1*0 =0, ... 
	multiply(matrixA, matrixB);
	5004163140
*/
public class twoDarrays {
	public static void multiply(int[][] a, int[][] b) {
		int finalProduct = 0;
		for (int i = 0;i < 4; i ++) {
			for (int j = 0; j < 6; j++) {
					finalProduct = a[i][j] * b[i][j];
					System.out.print(finalProduct +  " ");
					
			}
		}
	}

	public static void main(String[] args){
		int[][] array1  = {{1, -6, 0, 9, 4, 7},{-5, 6, 0, -2, 43, 21},{94, 50, 8, -1, 92, 98},{35, 44, 15, 49, 66, 87}};
		int[][] array2 = {{5, -9, 0, 7, 6, 79},{55, -6, 40, -22, 413, 221},{944, 540, 81, -1, -92, 928},{235, 442, 154, 449, 466, 847}};
		multiply(array1, array2); 
	}
}