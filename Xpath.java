package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Downloads/grotechminds.html");
	driver.manage().window().maximize();
	WebElement e1 =driver.findElement(By.xpath("(/html/body/input)[1]"));
	e1.sendKeys("test data");
	WebElement e2 =driver.findElement(By.xpath("(/html/body/input)[2]"));
	e2.sendKeys("test data");
	WebElement e3 =driver.findElement(By.xpath("(/html/body/input)[3]"));
	e3.sendKeys("test");
	WebElement e4=driver.findElement(By.xpath("(html/body/form/input)[1]"));
	e4.sendKeys("Nithya");
	             
	// driver.findElement(By.xpath("html/body/input)[4]")).click();
	 
	 WebElement e5 = driver.findElement(By.xpath("//html/body/select"));
	 
	 	 Select s1 = new Select(e5); 
	 s1.selectByIndex(3);	
 }
}




