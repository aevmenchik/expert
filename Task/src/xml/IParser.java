package xml;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface IParser  {
	public ArrayList<String> readFile() throws ParserConfigurationException, SAXException, IOException;
	

}
