package gitHubPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		prop.setProperty(".Browser", "chrome");
		prop.setProperty("username","pralipta");
		prop.setProperty("password","p@123");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/New Text Document (3).txt");
		prop.store(fos, "propertyfiledata");
		FileInputStream fis=new FileInputStream("./src/test/resources/New Text Document (3).txt");
		prop.load(fis);
		String properties = prop.getProperty("browser");
		System.out.println(properties);
		

	}

}
