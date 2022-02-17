package Academy.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base 
{
   public void intializeDriver() throws IOException
   {
	   FileInputStream fis = new FileInputStream(":\\Java Programs\\E2EProject\\data.properties");
	   Properties p = new Properties();
	   
	   p.load(fis);
	   
	   System.out.println(p);
   }
}
