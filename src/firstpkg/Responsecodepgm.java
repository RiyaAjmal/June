package firstpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Responsecodepgm {
	EdgeDriver driver;
	String baseUrl="http:\\www.google.com";
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@Test
	public void test1() 
	{
		try {
		driver.get(baseUrl);
		
		URL u=new URL(baseUrl);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Successfull---"+baseUrl);
			
		}
		else
		{
			System.out.println("not 200");
		}
		}
		catch(Exception e)
		{
			System.out.println("error");
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}
	}

}
