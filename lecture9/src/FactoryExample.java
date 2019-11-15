class Factory {
	private String name;
	private String location;
	private int workerAmount;
	private boolean isBankrupt = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWorkerAmount() {
		return workerAmount;
	}

	public boolean isBankrupt() {
		return isBankrupt;
	}

	void hireNewWorker(String employeePosition) {
		if (!this.isBankrupt) {
			this.workerAmount++;
			System.out.println("Hired new employee " + employeePosition
					+ " now there are " + this.workerAmount + " workers");
		} else {
			System.out.println(this.name
					+ " factory  is bankrupt. You cannot hire new workers");
		}
	}

	void fireWorker() {
		if (workerAmount > 0) {
			this.workerAmount--;
			System.out.println("There are now " + this.workerAmount
					+ " workers working there.");
		} else {
			System.out.println("There are no workers at the " + this.name
					+ " at this time. There is no one to fire.");
		}
	}

	void fireAll() {
		this.workerAmount = 0;
		System.out.println("There are no workers working there.");
	}

	void bankrupt() {
		this.fireAll();
		System.out.println(this.name + " is bankrupt.");
		this.isBankrupt = true;
	}

	void printStatus() {
		System.out.println("The name of the factory is " + this.name
				+ "located in " + this.location + " has " + this.workerAmount
				+ " workers");
	}
}

public class FactoryExample {
	public static void main(String[] args) {
		Factory factory2 = new Factory();
		factory2.setName("Milk");
		factory2.setLocation("Riga");
		factory2.printStatus();
		factory2.hireNewWorker("Director");
		// factory.printStatus();
		factory2.hireNewWorker("Manager");
		// factory.printStatus();
		factory2.fireWorker();
		factory2.printStatus();
		factory2.fireAll();
		factory2.printStatus();
		factory2.hireNewWorker("Assistant");
		factory2.hireNewWorker("Truck driver");
		factory2.printStatus();
		factory2.bankrupt();
		factory2.hireNewWorker("PLumber");
		// factory.fireWorker();
	}
}