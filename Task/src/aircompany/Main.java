package aircompany;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import exceptions.NotFullAirCompanyException;
import planes.Tu134;
import planes.Tu137;
import planes.Tu157;
import speed.SpeedList;
import speed.SpeedMap;
import speed.SpeedSet;
import stream.StreamFile;
import xml.XmlDomParser;

public class Main  {
	public static void main(String[] args) throws NotFullAirCompanyException, ParserConfigurationException, SAXException, IOException {

		//Main.AirplaneTask();
		//Main.SpeedTask();
		//Main.StreamTask();
		//Main.XmlTask();
		
	
	}
	
	public static void XmlTask()  {
		try {
			XmlDomParser parser = new XmlDomParser();
			ArrayList<String> list = new ArrayList<String>();
			try {
				list = parser.readFile();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (IOException e) {
			System.out.println("File is not found");
			
		}
		
	}
	
public static void StreamTask() {
		//StreamFile streaming = new StreamFile();
	
		try {
			String fileData = StreamFile.readFile();
			System.out.println(fileData);
		} catch (IOException e) {
			System.out.println("File is not found");
			
		}
		
		
	}
	
public static void SpeedTask() {
		
		SpeedList.ListSpeed();	
		SpeedSet.ListSpeed();
		SpeedMap.ListSpeed();
	}
		
	public static void AirplaneTask () {
		Tu134 tu134 = new Tu134("Tu134", 900, 1000, 1100, "gas");
		Tu137 tu137 = new Tu137("Tu137", 800, 900, 1200, "white");
		Tu157 tu157 = new Tu157("Tu157", 700, 1200, 1150, "steel");
	
		
		AirCompany aircompany = new AirCompany();
		aircompany.add(tu134);
		aircompany.add(tu137);
		aircompany.add(tu157);

	
		System.out.println("\n-------------------------");
		System.out.println("\nOverall capacity is "+aircompany.getCapacity());
		System.out.println("\n-------------------------");
	
		System.out.println("\nOverall Сarry Capacity is " + aircompany.getCarryCapacity());
		System.out.println("\n-------------------------");
		System.out.println ("AirPlanes sorted by range: "+aircompany.sortedbyRange());
		System.out.println("\n-------------------------");
		
		System.out.println("Airplane with capacity higher than entered value - " + aircompany.getAirplaneByCapacity());
		System.out.println("\n-------------------------");
	}
}
	
