package stream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamFile {
	
	//String fileName = "/Users/hanna_yantsevich/Documents/JAVA lessons/aircompany.txt";
	
	public static String readFile() throws IOException {

		InputStream is = new FileInputStream("/Users/hanna_yantsevich/Documents/JAVA lessons/aircompany.txt");
		int size = is.available();
		
		String result = null;
		

		for(int i = 0; i < size; i++) {
			result+=((char)is.read());
		}
		is.close();
		
		return result;	
}
	
	public void writeFile(String fileName, String[] data) {
		
	}
}


