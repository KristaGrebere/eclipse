import java.util.Scanner;

class User {
	// fields
	String name;
	int age;
	boolean man;
	String hairColor;
	
	void sayHi(){
		System.out.println("Hi, my name is " + name + " I'm " + age + " years old.");
}
}

public class App {
	
	public static void main(String[] args) {

		String name = "Peter";
		int age = 21;
		boolean man = false;
		String name1 = "Anna";
		int age2 = 22;
		boolean man2 = true;
		
		User peter = new User();
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;
		peter.hairColor = "grey";
		peter.sayHi();
		
		User anna = new User();
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		anna.hairColor = "black";
		anna.sayHi();
		
		User krista = new User();
		krista.name = "Krista";
		krista.age = 31;
		krista.man = false;
		krista.hairColor = "brown";
		krista.sayHi();
	}

}