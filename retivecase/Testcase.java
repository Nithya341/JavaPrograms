package retivecase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase {
@Test(retryAnalyzer=retivecase.Retrylogic.class)
public void login() throws InterruptedException
{
	ChromeDriver driver = new  ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.name("qq"));
	e1.sendKeys("Bangalore"+Keys.ENTER);
/*	Thread.sleep(3000);
List<WebElement>e2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
int length =e2.size();	
System.out.println(length);
for(int i=0;i<length;i++)
{
WebElement a1=e2.get(i);
System.out.println(a1.getText());
}
e2.get(2).getText();
*/
}
}

