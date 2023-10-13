package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbcreatepage;

public class Fbcreatepagetest {
	WebDriver driver;
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");
		Fbcreatepage ob =new Fbcreatepage(driver);
		ob.createpageclick();
		ob.getstartedclick();
	}
		

}
