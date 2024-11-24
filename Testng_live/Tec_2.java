package Testng_live;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tec_2 extends Launchquit {
	
	@Test
	
	public void login_search_logout() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//WebElement e2 = driver.findElement(By.xpath("//span[.='Mens Akron Memory Foam Comfort Shoes|Running|Walking|Training|Gym|Jogging|Sneaker|Athletic|Laceup|Flexible|Lightweight|Dailyuse|Sports|Casual|ExtraSoft|Fitness']"));
	WebElement e1=	driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		//WebElement e9= driver.findElement(By.xpath("//div[@class='a-section a-spacing-none _bGlmZ_info_2BknS _bGlmZ_block_3tqiN _bGlmZ_wFull_1M3az _bGlmZ_col_Tdevo']"));
	e1.click();
	Set<String> id=    driver.getWindowHandles();
	   Iterator<String> li=  id.iterator();
	  String  Parent= li.next();
	  String  child= li.next();
	  driver.switchTo().window(child);
	  Thread.sleep(3000);
	  WebElement e3 = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
	  e3.click();
	  WebElement e4 = driver.findElement(By.xpath("//span[@id='sw-gtc']"));
	  e4.click();
	  
	
			}

}
