package planes;

public class Tu134 extends Airplane implements Showable{

	private String petrol;
	public Tu134(String name, int capacity, int range, int carryCapacity, String petrol) {
		super(name, capacity, range, carryCapacity);
		this.petrol = petrol;
		
		
	}
	
	public String getPetrol() {
		return petrol;
	}


	public void setPetrol(String petrol) {
		this.petrol = petrol;
	}

	@Override
	public String show() {
		 return "Name: " + getName() +
	                "\nType of petrol: " + getPetrol() +
	                "\nCapacity: " + getCapacity() +
	                "\nCarryCapacity: " + getCarryCapacity() +
	                "\nRange: " + getRange() + "\n" ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petrol == null) ? 0 : petrol.hashCode());
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
		Tu134 other = (Tu134) obj;
		if (petrol == null) {
			if (other.petrol != null)
				return false;
		} else if (!petrol.equals(other.petrol))
			return false;
		return true;
	}
	
	

}
