package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg_81 {
public static void main(String[] args) {
	ChromeDriver driver = new  ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.xpath("//select[@id='Skills']"));
	Select li = new Select(e1);
	li.selectByVisibleText("Technical Skills");
	
	WebElement e2 = driver.findElement(By.xpath("//select[@id='Country']"));
	Select la = new Select(e2);
	la.selectByValue("Afganistan");
		
	WebElement e3 = driver.findElement(By.xpath("//select[@id='Relegion']"));
	Select lw = new Select(e3);
	lw.selectByIndex(1);
	
}
}
