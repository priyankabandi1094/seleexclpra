package Excel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Readpropertydata {

	public static void main(String[] args) throws IOException  {
		
		Properties  propertiesobj=new Properties();
		
		FileInputStream  file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		propertiesobj.load(file);
		
		String url=propertiesobj.getProperty("appurl");
		
		
		String username=propertiesobj.getProperty("username");
		
		String password=propertiesobj.getProperty("password");

		String email=propertiesobj.getProperty("email");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);


		

	}

}
