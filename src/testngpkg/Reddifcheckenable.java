package testngpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddifcheckenable {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value ='m']"));
		if(radiobutton.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not slected");
		}
		
	}
	@Test
	public void test2()
	{
		WebElement createb=driver.findElement(By.xpath("//input[@id='Register']"));
		if(createb.isEnabled())
		{
			System.out.println("sucess");
	}
		else
		{
			System.out.println("not enabld");
		}
		
	}

	}

