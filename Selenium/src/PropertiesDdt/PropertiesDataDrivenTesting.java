package PropertiesDdt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDataDrivenTesting {
	public static void main(String[] args) throws IOException {
		//Give the path
		FileInputStream fils=new FileInputStream("./Data/demo.properties");
		//create obj for properties
		Properties pObj=new Properties();
		//load the file
		pObj.load(fils);
		//fetch the data
		String url=pObj.getProperty("url");
		System.out.println(url);
		
		
	}
}
