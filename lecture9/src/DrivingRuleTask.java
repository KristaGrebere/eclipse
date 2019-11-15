class DrivingRule {
	private final String name;
	private static String country; 
	private static int MAX_SPEED_IN_CITY;
	private static int MAX_SPEED_OUTSIDE;

	public User(String name) {
		this.name = name;
		totalUserAmount++;
		this.country = "Latvia";
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "User [name=" + this.name + "] totalUsers=" + totalUserAmount;
	}
}

public class DrivingRuleTask {
	private static final int SPEED_IN_TOWN = 50;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		new User("Vasilij");
		new User("Baiba");
		new User("Vita");
		User vasilij = new User("Anna");
		System.out.println(vasilij.toString());
	}
}