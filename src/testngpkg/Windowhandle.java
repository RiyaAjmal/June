package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void test1()
	{
		driver.get ("http://demo.guru99.com/popup.php");
		String parentWindow = driver.getWindowHandle(); //currentwindow
		System.out.println("Parent Window Title " + driver.getTitle()); driver.findElement (By.xpath("/html/body/p/a")).click();
		Set <String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
		if (!handle. equalsIgnoreCase (parentWindow)) {
		driver.switchTo() . window(handle);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		String s = driver.findElement (By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
		System. out. println(s);
		driver. close();
		}
		driver. switchTo() .window(parentWindow);
	}
}
}
