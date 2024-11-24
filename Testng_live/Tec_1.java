package Testng_live;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tec_1 extends Launchquit{
	
	@Test
	public void login_search()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
