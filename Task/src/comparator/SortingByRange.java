package comparator;

import java.util.Comparator;

import planes.Airplane;

public class SortingByRange implements Comparator<Airplane> {

	@Override
	public int compare(Airplane o1, Airplane o2) {
		
		return o1.getRange()-o2.getRange();
	}

	
}
