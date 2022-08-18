package GenericLibrary;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	//Read the values from properties file
		public static String readValue(String strparameter) throws IOException
		{
			String propertyvalue="ABC";
			File file = new File("./Variables.properties");

			FileInputStream fileInput = null;
			
			try {
			fileInput = new FileInputStream(file);
			BaseClass.log.info("Fetching the property file data");
			Properties p = new Properties();
			p.load(fileInput);
			String propertyvalue1 = p.getProperty(strparameter);
			BaseClass.log.info("Passing the value from property file - " + propertyvalue1);
			fileInput.close();
			propertyvalue=propertyvalue1;
			}
			catch(IOException e)
			{
			    e.printStackTrace();
			}
			
			return(propertyvalue);
		}
}
