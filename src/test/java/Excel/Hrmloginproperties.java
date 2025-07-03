package Excel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmloginproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
			
			Properties  propertiesobj=new Properties();
			
			FileInputStream  file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Login.properties");
			
			propertiesobj.load(file);
			
			String url=propertiesobj.getProperty("appurl");
			
			
			String username=propertiesobj.getProperty("username");
			
			String password=propertiesobj.getProperty("password");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[starts-with(@class,'oxd-butto')]")).click();
			
		
		


	}

}
