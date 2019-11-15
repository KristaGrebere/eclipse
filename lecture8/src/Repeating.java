class Car{

	String color;
	int speed;
	String name;
	
	void drive(){
		System.out.println("drive " + this.name);
	}
	String methodOne (int String){
		return "Driving on " + color + "with speed" + speed;
	
	}
}
	
public class Repeating {

	/**
 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.name = "My super duper car";
		myCar.drive();
		
		
		String msg = methodOne (56, "red");
		System.out.println(msg);
		
		Car stolenCar = new Car();
		stolenCar.name = "Stolen car";
		stolenCar.drive();
		
		
	}

}
