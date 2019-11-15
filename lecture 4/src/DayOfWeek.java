
public class DayOfWeek {


	public static void main(String[] args) {
		int dayIndex = 3;
		/*if (dayIndex == 1){
		System.out.println("Moday");
		}else if (dayIndex == 2){
		System.out.println("Tuesday");
		}else if (dayIndex == 3){
			System.out.println("Wednesday");
		}else if (dayIndex == 4){
			System.out.println("Tuesday");*/
			
			switch(dayIndex){
		case 1:
			System.out.println("Friday");
		case 2: 
			System.out.println("Thursday");
		case 3: 
			System.out.println("Wednesday");
		case 4:
			System.out.println("Tuesday");
		case 5:
			System.out.println("Mondday");
			break;
		default: 
			System.out.println("Unimplemented part,for dayIndex=" +dayIndex);
		
		
		

}
	}}