package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asd115 {
ChromeDriver driver ;
	@Test
	public void registration() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@id='firstName']"));
		e1.sendKeys("Nithya");
		WebElement e2 = driver.findElement(By.xpath("//input[@id='lastName']"));
		e2.sendKeys("sree");
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='email']"));
		e3.sendKeys("shreenithya470@gmail.com");
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id='phone']"));
		e4.sendKeys("7845621458");
		
		WebElement e5 = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s1 = new Select(e5);
		s1.selectByIndex(2);
		
		WebElement e6 = driver.findElement(By.xpath("//select[@id='state']"));
		Select s2 = new Select(e6);
		s2.selectByIndex(2);
		
		WebElement e7 = driver.findElement(By.xpath("//input[@id='aadhaar']"));
		e7.sendKeys("789456123456");
		
		WebElement e8 = driver.findElement(By.xpath("//input[@id='pan']"));
		e8.sendKeys("WDFGY1234E");
		
		Thread.sleep(3000);
		
		WebElement e9 = driver.findElement(By.xpath("//input[@id='terms']"));
		e9.click();
		
		boolean w=e9.isSelected();
		Assert.assertEquals(e9.isSelected(), true,"The login is not successful as you did not check the check box");
	}
}
