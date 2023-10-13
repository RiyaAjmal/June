package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {

	public static void main(String[] args) {
		
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		String src=driver.getPageSource();
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
