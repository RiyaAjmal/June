package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
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
	WebElement day_dropdown = driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
    Select day = new Select(day_dropdown);
    day.selectByVisibleText("05");
    WebElement month_dropdown = driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
    Select month = new Select(month_dropdown);
    month.selectByVisibleText("JAN");
    WebElement year_dropdown = driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
    Select year = new Select(year_dropdown);
    year.selectByVisibleText("1990");
	}

}
