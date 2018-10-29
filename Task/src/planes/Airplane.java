package planes;

public class Airplane {

	public Airplane(String name, int capacity, int range, int carryCapacity) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.range = range;
		this.carryCapacity = carryCapacity;
	}

	private String name;
	private int capacity;
	private int range;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}

	private int carryCapacity;

	public String show() {
		return "Name: " + getName() + "\nCapacity: " + getCapacity() + "\nCarryingCapacity: " + getCarryCapacity()
				+ "\nRange: " + getRange() + "\n";
	}
}
