import java.util.Scanner;

public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("What is your age?"); int age = scanner.nextInt();
		 * System.out.println("User age is:" + age);
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter number:"); double input =
		 * scanner.nextDouble(); System.out.println(input); if(input<0){
		 * System.out.println(input + "is Negative"); }else {
		 * 
		 * System.out.println("Positive");
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which day it is?:");
		int input = scanner.nextInt();
		//System.out.println(input);
		switch(input){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;

	}
}}
