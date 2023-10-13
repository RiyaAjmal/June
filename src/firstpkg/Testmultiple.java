package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testmultiple {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://google.com");
	}
	@Test
    public void titleverification()
    {
		String actualtitle=driver.getTitle();
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
    }
	@Test
	public void pagesource()
	{
		String src=driver.getPageSource();
		src.contains("Gmail");
		 if(src.contains("Gmail"))
	        {
	        	System.out.println("pass");
	        }
	        else
	        {
	        	System.out.println("fail");
	        }
	}
	
	

}
