package practisPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebfs.qa.properties.TestBaseProperties;


public class Seliniumpppp {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(practisF.propertyPath);
		prop.load(ip);
		
		System.setProperty(prop.getProperty("cromeDriver"),prop.getProperty("cromePath"));
      WebDriver driver= new ChromeDriver();
      driver.get(prop.getProperty("url"));
      
      
	}

}
