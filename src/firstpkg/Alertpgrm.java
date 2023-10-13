package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgrm {
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@Test
		public void test1()
		{
			driver.get("file:///C:/Users/dell/Desktop/luminar/New%20folder/alert.html");
			driver.findElement(By.xpath("/html/body/input[1]")).click();
			Alert a=driver.switchTo().alert();
			String alertext=a.getText();
			System.out.println(alertext);
			a.accept();
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("riya");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("noushad");
			driver.findElement(By.xpath("/html/body/input[4]")).click();		
		}
	

}
