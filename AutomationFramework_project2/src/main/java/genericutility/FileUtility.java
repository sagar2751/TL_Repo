package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtility 
{
	public String getDataFromPropert(String key) throws IOException
	{
		 FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		 Properties prop = new Properties();
		 prop.load(fis);
		 return prop.getProperty(key);
	}

}
//key it is present in property file 