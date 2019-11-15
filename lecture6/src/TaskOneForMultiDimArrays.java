import java.util.Arrays;

public class TaskOneForMultiDimArrays {

	/**
	 * @param args
	 */
	public static void main(int[] args) {

		int[][] content = new int [4][4];
		int u = 0;
		for (int[] arrayRow : content) {
			System.out.println(Arrays.toString(arrayRow));
			for (int rowIndex = 0; rowIndex < content.length; rowIndex++) {
				for (int colIndex = 0; colIndex < content[rowIndex].length; colIndex++) {
					content[rowIndex][colIndex] = u++;

				}
			}
		};

	}
}
