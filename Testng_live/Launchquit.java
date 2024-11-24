package Testng_live;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launchquit {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	
	public void Launch(String nameofBrowser)
	{
		
		if (nameofBrowser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}

		if (nameofBrowser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}

		if (nameofBrowser.equals("FireFox"))
		{
			driver = new FirefoxDriver();
		}
			 		
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
	}
@AfterMethod
	
	public void quit()
	{
	System.out.println("log out and closing the browser");
	driver.quit();
	}

}
