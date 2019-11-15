class Plane {

	
	String brand;
	double seats;

	String something() {
		return "Plane " + brand + "can carry " + seats + " people";
	}
}

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		/*
		 * Create a method which has 2 arguments one of type boolean and another
		 * double and this method should return String value as concatenation of
		 * arguments
		 */
		Plane plane1 = new Plane();
		plane1.brand = "Boing";
		plane1.seats = 378;
		plane1.something();

		
		String msg = something();
		

	}
}
