package testngpkg;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontab ch
	d
   	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
   	String parentWindow = driver.getWindowHandle();
    
   	  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2")).click();
   	
	Set <String> allWindowHandles = driver.getWindowHandles();
	for (String handle : allWindowHandles) {
		
	if (!handle. equalsIgnoreCase (parentWindow))
	{
	driver.switchTo() . window(handle);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	
	}
}
}
}