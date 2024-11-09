package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksearch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("shreenithya470@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass=1234");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.close();
	}

}
