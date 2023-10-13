package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
        ChromeDriver driver;
	      
	      @Before
	      public void setup()
	      {
	    	  driver=new ChromeDriver();
	      }
	      @Test
	       public void test1()
	       {
	    	  driver.get("http://amazon.in");
	    	  driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles");
	          driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	          driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
	          driver.findElement(By.xpath("//*[contains(text(),'Amazon Renewed')]")).click();
	          
}
}