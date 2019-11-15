import java.util.Scanner;


public class ArraysTask2 {

	public static void main(String[] args) {
		/*String[] dayOfWeek = new String[7];
		dayOfWeek[0] = "Monday";
		dayOfWeek[1] = "Tuesday";
		dayOfWeek[2] = "Wednsday";		for(String dayName : dayOfWeek){
			System.out.println(dayName);
		}*/		String[] dayOfWeek = {"Monday", "Tuesday", "Wednasday", "Thursday"};
//		for(String dayName : dayOfWeek){
//			System.out.println(dayName);
			Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day index:");		
		int dayIndex = scanner.nextInt(); // reduce by one to work with zero based indexes
		if(dayIndex < 1 || dayIndex > 4){
			System.out.println( "Incorrect index " + dayIndex + "  passed by user");
		}else{		
			System.out.println(dayOfWeek[dayIndex -1]);
		}
	}}