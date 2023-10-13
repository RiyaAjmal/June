package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(btn);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement click=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(click);
		act.perform();
		String alertext=a.getText();
		System.out.println(alertext);
		a.accept();
		
	}

}
