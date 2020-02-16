package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties; //ctrl+shift+O

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException { //IOexception is superclass of file not found exception
		
		Properties p= new Properties(); 
		FileInputStream file = new FileInputStream("H:\\Automation_Selenium\\BasicCoreJava\\src\\fileHandling\\OR.properties"); //file not found exception
		p.load(file); //the file should be loaded before any actions to be done on the file
		System.out.println(p.get("surname"));
	}

}
