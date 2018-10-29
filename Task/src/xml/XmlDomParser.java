package xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDomParser implements IParser {

	public ArrayList<String> readFile() throws ParserConfigurationException, SAXException, IOException {
		File xmlFile = new File("/Users/hanna_yantsevich/Documents/JAVA lessons/aircompany.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlFile);
		
		doc.getDocumentElement().normalize();
		
		ArrayList<String> xmlData = new ArrayList<String>();
		xmlData.add("Root element: " + doc.getDocumentElement().getNodeName());
		NodeList list = doc.getElementsByTagName("Airplane");
		
		for (int i = 0; i<list.getLength(); i++) {
			Node node = list.item(i);
			xmlData.add("Current element = :" + node.getNodeName());
			
			if (node.getNodeType()== Node.ELEMENT_NODE) {
				Element element = (Element)node;
				xmlData.add("Name: "+ element.getElementsByTagName("Name").item(0).getTextContent());
				xmlData.add("Capacity: "+ element.getElementsByTagName("Capacity").item(0).getTextContent());
				xmlData.add("CarryCapacity: "+ element.getElementsByTagName("CarryCapacity").item(0).getTextContent());
				xmlData.add("Range: "+ element.getElementsByTagName("Range").item(0).getTextContent());
				
			}
		}		
		
		
		return xmlData;
		
		
	}
	
	
}
