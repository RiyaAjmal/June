package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextverification {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	 	String buttontext=driver.findElement(By.xpath("//input[@value='Check availability']")).getAttribute("value");		
		if(buttontext.equals("Check availability"))
		{
		
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
