package aircompany;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import comparator.SortingByRange;
import exceptions.NotFullAirCompanyException;
import planes.Airplane;

public class AirCompany  {

	
	
	public AirCompany() {
		super();
		
	}

	ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
	
	public void add(Airplane airplane) {
		airplanes.add(airplane);

		System.out.println(airplanes);
		System.out.println(airplane.show());
	}
	
	public int getCapacity () {
		int sum = 0;
		for (Airplane airplane: airplanes) {
			sum += airplane.getCapacity();
			
		}
		return sum;
	}
	
	public int getCarryCapacity () {
		int sum = 0;
		for (int i = 0; i<this.airplanes.size(); i++) {
			sum += this.airplanes.get(i).getCarryCapacity();
			
		}
		return sum;
	}
	
	public ArrayList<Airplane> sortedbyRange () {
		this.airplanes.sort(new SortingByRange());
		
		return this.airplanes;
	}
	
	public Airplane getAirplaneByCapacity() {
			Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter min value of capacity");
	        int a = scanner.nextInt();
	        
		for (int i = 0; i<this.airplanes.size(); i++) {
			if(a<this.airplanes.get(i).getCapacity()) {
				return this.airplanes.get(i);
			}
		
		}
		return null;
	}
		
}


