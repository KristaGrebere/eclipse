import java.util.Scanner;


public class HomeWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter triangle size");
		int size = scanner.nextInt();
		for(int i=1; i <= size; i++){
			String row = "";
			for(int j=1;j<=i;j++){		
				row = row + "" + i;
				//System.out.print(i);
			}
			System.out.println(row);
		}
	}
		
		
		
		
		

	}
	

