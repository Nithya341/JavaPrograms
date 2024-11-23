package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_91_92 {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		a1.doubleClick(e2).perform();
		
		WebElement e3 = driver.findElement(By.xpath("//a[.='Flights']"));
	   a1.contextClick(e3).perform();
	  boolean w= e3.isSelected();
	  System.out.println(w);
	  boolean x=e3.isDisplayed();
	  System.out.println(x);
	  if(w==true && x==true)
	  {
		  System.out.println("All the elements are present as such ");
	  }
		
		

	}
	}


