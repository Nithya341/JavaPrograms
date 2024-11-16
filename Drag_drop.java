package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();//to maximize or minimize the window	
		WebElement e2 = driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement e3 = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e2, e3).perform();
		a1.dragAndDrop(e3, e2).perform();
	}

}
