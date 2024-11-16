package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getwindowhandles_practice {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']"));
		e1.click();
		Set<String> id=    driver.getWindowHandles();
		   Iterator<String> li=  id.iterator();
		  String  Parent= li.next();
		  String  child= li.next();
		  driver.switchTo().window(child);
		WebElement e2 = driver.findElement(By.xpath("//input[@id='identifierId']"));
		e2.sendKeys("shreenithya470@gmail.com");
		WebElement e3 = driver.findElement(By.xpath("//span[.='Create account']"));
		e3.click();
		//input[@id='firstName']
		WebElement e4 = driver.findElement(By.xpath("//input[@id='firstName']"));
		e4.sendKeys("Nithyasree");
	
		WebElement e5 = driver.findElement(By.xpath("//input[@id='lastName']"));
		e5.sendKeys("sumithra");
		//span[.='Next']
		WebElement e12 = driver.findElement(By.xpath("//span[.='Next']"));
		e12.click();
		
		WebElement e6 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(e6);
		s1.selectByIndex(1);
		
		WebElement e7 = driver.findElement(By.xpath("//input[@id='day']"));
		e7.sendKeys("14");
		
		WebElement e8 = driver.findElement(By.xpath("//input[@id='year']"));
		e8.sendKeys("2000");
	
		WebElement e9 = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s3 = new Select(e9);
		s3.selectByIndex(1);
	}
	

}
