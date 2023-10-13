package firstpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkvalidation {
	ChromeDriver driver;
	String baseUrl="https://www.facebook.com";
	@Before
	public void setup1()
	{
		driver=new ChromeDriver();
	}
	
		
	
		
		@Test
		public void test1() {
			
			driver.get(baseUrl);
			
			List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
			System.out.println("total number of links="+linkdetails.size());
			 for(WebElement link:linkdetails){
				 String c= link.getAttribute("href");
				 Verify(c);
				 }
		}
		private void Verify(String c) {
			// TODO Auto-generated method stub
			try
			{
				URL u=new URL(c);
				HttpURLConnection con=(HttpURLConnection)u.openConnection();
				con.connect();
				if(con.getResponseCode()==200)
				{
					System.out.println("succesfull...200"+c);
					
				}
				
				else
				{
					System.out.println("not 200");
				}
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			
			
		}
	
	}

