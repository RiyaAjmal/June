package testngpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayquestion {
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
		List <WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total no.of links="+links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getText()+"--"+link.getAttribute("href"));
		}
		WebElement createb= driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		if(createb.isEnabled())
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"gh-la\"]")).isDisplayed();
		if(logo)
		{
			System.out.println("present");
			
		}
		else
		{
			System.out.println("not present");
		}
		if(driver.getPageSource().contains("Daily Deals"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
}
}