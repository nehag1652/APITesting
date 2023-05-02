package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


//input parameter----File Location
//purpose of this method----to load the properties
//output parameter----it will return the object of properties 
public class HandlePropertiesFile {
	
	public static Properties loadProperties(String filePath) throws IOException {
		
		File f = new File(filePath);
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		return pr;

	}

}
