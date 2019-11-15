
public class ArraysTask4 {


	public static void main(String[] args) {
		int[] myArray = { 1, -3, 44, -39}; 
		int sum = 0;
		for(int i = 0; i< myArray.length; i++){
			sum = sum + myArray[i];     
		}	
		// first iter sum = 0 + 1
		// second iter sum = 1 + (-2) =>  -1
		// third iter sum = (-1) + 44 => 43
		// sum = 43 + (-39) => 4		
		System.out.println("Sum: " + sum);

	}

}
