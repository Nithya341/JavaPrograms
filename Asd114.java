package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asd114 {
	@Test
	public void search()
	{
		
	ChromeDriver driver = new  ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();//to maximize or minimize the window
	WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
    Assert.assertEquals(e1.isEnabled(), false,"The search text box is enabled");
}
}

