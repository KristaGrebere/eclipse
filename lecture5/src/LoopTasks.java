import java.util.Scanner;


public class LoopTasks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		} while (value != 0);
		System.out.println("Got 0" +
				"!");
	}



	}
