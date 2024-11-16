package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.flipkart.com/july-2024-big-bachat-days-store?param=1299&s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAiAudG5BhAREiwAWMlSjJq1ucgCjfHq5OIgwjBYWPcgCBty9FxwgVw57KfmcGgeilEuMItKbBoCnRoQAvD_BwE");
		driver.manage().window().maximize();//to maximize or minimize the window	
		WebElement e4 = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		e4.sendKeys("shoes");
	    List<WebElement> a = driver.findElements(By.xpath("//form[@class='Hy6F9O header-form-search']/ul/li"));
	    int length =a.size();
	    for(int i=0;i<length;i++) {
	    	WebElement n=a.get(i);
	    	System.out.println(n.getText());
	    }
	    a.get(2).click();
	    
	    
	    
	  //span[.='Mobiles'] 
	    
	
		//form[@class='Hy6F9O header-form-search']/ul/li
	
	
}
}

