package Assignment;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asd113 {
	ChromeDriver driver;
	@Test
	
	public void login()
	{
		 driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("shreenithya470@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass=1234");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		String name =driver.getTitle();
		System.out.println(name);
		Assert.assertEquals(driver.getTitle(),"facebook","login not successful");
	}
@Test(dependsOnMethods = "login")

public void logout()
{
	driver.close();
}
}
