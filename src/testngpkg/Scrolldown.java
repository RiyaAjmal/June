package testngpkg;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolldown {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options. addArguments ("--disable-notifications");
		driver=new ChromeDriver(options);
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.justdial.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/footer/div[1]/div[7]/div/div[1]/ul/li[1]/a")).click();

}
}
