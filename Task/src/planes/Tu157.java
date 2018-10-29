package planes;

public class Tu157 extends Airplane implements Showable {

	
	private String material;
	
	public Tu157(String name, int capacity, int range, int carryCapacity, String material) {
		super(name, capacity, range, carryCapacity);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	public String show() {
        return   "Name: " + getName() +
                "\nType of material: " + getMaterial() +
                        "\nCapacity: " + getCapacity() +
                        "\nCarryCapacity: " + getCarryCapacity() +
                        "\nRange: " + getRange() + "\n";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
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
		Tu157 other = (Tu157) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}
	
	

}
