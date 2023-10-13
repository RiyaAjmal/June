package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("http://www.ebay.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
	    driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div[2]/div/div[3]/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
	    
	}

}
