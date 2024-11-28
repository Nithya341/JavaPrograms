package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Google_data_provider {
@DataProvider(name="googlesearch")
	
	public Object[][] sample(){
		Object data [][] = new Object [4][1];
		
		data[0][0] = "shoes";
		//data[0][1] = "1234";
		
		data[1][0] = "heater";
		//data[1][1] = "1234";
		
		data[2][0] = "mobile";
		//data[2][1] = "";
		
		data[3][0] = "jacket";
		//data[3][1] = "Pass1234";
		
		//data[4][0] = "hat";
		//data[4][1] = "92wnd";
		
		return data;
		
			
	}

	@Test(dataProvider="googlesearch")
	public void loginfax(String search) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();//to maximize or minimize the window
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(search+Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
	    //WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		//e1.	sendKeys(password);
		
		

}
}


