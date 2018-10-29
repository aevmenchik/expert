package planes;

public class Tu137 extends Airplane implements Showable {
	
	private String color;
	
	public Tu137(String name, int capacity, int range, int carryCapacity, String Color) {
		super(name, capacity, range, carryCapacity);
		this.color = color;
	}
	 
	 public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public String show() {
		 return "Name: " + getName() +
	                "\nColor: " + getColor() +
	                "\nCapacity: " + getCapacity() +
	                "\nCarryCapacity: " + getCarryCapacity() +
	                "\nRange: " + getRange() + "\n" ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tu137 other = (Tu137) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	
	
}
