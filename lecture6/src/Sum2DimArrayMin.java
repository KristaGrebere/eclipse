import java.util.Arrays;


public class Sum2DimArrayMin {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			int[][] twoDim = new int[4][4];
			int u = 0;
			for (int rowIndex = 0; rowIndex < twoDim.length; rowIndex++) {
				for (int colIndex = 0; colIndex < twoDim[rowIndex].length; colIndex++) {
					twoDim[rowIndex][colIndex] = u++;
				}
			}
			for (int[] arrayRow : twoDim) {
				System.out.println(Arrays.toString(arrayRow));
			}
		}
		

	}


