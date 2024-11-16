package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@id='FirstName']"));
		e1.sendKeys("Nithyasree");
		WebElement e2 = driver.findElement(By.xpath("//input[@id='LastName']"));
		e2.sendKeys("sumithra");
		WebElement e3 = driver.findElement(By.xpath("//input[@id='MiddleName']"));
		e3.sendKeys("sumithra");
		
		WebElement e4 = driver.findElement(By.xpath("//textarea[@class='work-place-address form-control']"));
		e4.sendKeys("this is wprk place area");
		
		WebElement e5 = driver.findElement(By.xpath("//textarea[@name='home-address']"));
		e5.sendKeys("this is address 561 DB Road RS puram MS complex coimbatore");
		//input[@class='Personal-Email form-control']
		WebElement e6 = driver.findElement(By.xpath("//input[@class='Personal-Email form-control']"));
		e6.sendKeys("this is personal email");
		
		WebElement e7 = driver.findElement(By.xpath("//input[@id='Corporate-email']"));
		e7.sendKeys("this is corporate email");
		//input[@id='tel']
		WebElement e8 = driver.findElement(By.xpath("//input[@id='tel']"));
		e8.sendKeys("9894093888");
		
		//button[@class='btn btn-primary']
		
		WebElement e9 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		e9.click();
		
}
}

