package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
      ChromeDriver driver;
      
      @Before
      public void setup()
      {
    	  driver=new ChromeDriver();
      }
      @Test
       public void test1()
       {
    	  driver.get("http://facebook.com");
    	  driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc2@gmail.com");
          driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
          driver.findElement(By.xpath("//button[@type='submit']")).click();
       }
      
  

}
