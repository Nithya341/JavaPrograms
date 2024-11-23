package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng_ass_11 {
	
	@Test
	
	public void show()
	{
	System.out.println("this is the @test");	
	}
	
	@Test
	public void c()
	{
		System.out.println("this is the @test");
	}
	@BeforeMethod
	
	public void s()
	{
		System.out.println("this is the @BeforeMethod");	
	}
@AfterMethod
	
	public void ws() {
	
		System.out.println("this is the @Aftermethod");
	}
}
