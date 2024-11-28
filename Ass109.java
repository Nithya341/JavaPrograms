package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass109 {
	@DataProvider(name="input")
	 public Object[][] med()
	 {
		Object add [][] = new Object[1][4];
	    
		add[0][0] = "Nithya";
		add[0][1] = "sree";
		add[0][2] = "shreenithya470@gmail.com";
		add[0][3] = "9566458219";
		 return add;
		 
	 }
	@Test(dataProvider="input")
	public void logi(String fat,String apple,String orange,String fax) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registeration-form/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fat);
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(apple);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(orange);
	Thread.sleep(3000);

}
}
