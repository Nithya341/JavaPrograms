package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazone_login_dataproanno {
	
	@DataProvider(name="Amazonelogin")
	
	public Object[][] sample(){
		Object data [][] = new Object [4][1];
		
		data[0][0] = "Nithya";
		//data[0][1] = "1234";
		
		data[1][0] = "Nithya@gmail.com";
		//data[1][1] = "1234";
		
		data[2][0] = "";
		//data[2][1] = "";
		
		data[3][0] = "Nithya902";
		//data[3][1] = "Pass1234";
		
		//data[4][0] = "Nithya@test";
		//data[4][1] = "92wnd";
		
		return data;
		
			
	}

	@Test(dataProvider="Amazonelogin")
	public void logindata(String username) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9154730%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D1591980458081218985%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26ie%3DUTF8%26index%3Daps%26keywords%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_e%26tag%3Dgooginhydr1-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin");
		driver.manage().window().maximize();//to maximize or minimize the window
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(username+Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
	    //WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		//e1.	sendKeys(password);
		
		
	}
}
