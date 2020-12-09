package ArrayList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Test{

	public static void main(String[] args) {
	

			 WebDriver driver=new ChromeDriver();
		
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chromedre.diver", "D:\\Selenium\\Drivers\\Chromeriver.exe");
		      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			 
			 driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			 driver.close();

		}

	}


