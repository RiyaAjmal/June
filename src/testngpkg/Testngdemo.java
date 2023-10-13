package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	@BeforeTest
	public void setup()
	{
		System.out.println("Browser open");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
	@Test(priority=2,dependsOnMethods =  {"test2"})
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("test 2");
	}
	@AfterMethod
	public void methodclose()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void teardoown()
	{
		System.out.println("after test");
	}

}
