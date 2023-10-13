package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
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
	@Test(groups = {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(groups = {"sanity"})
	public void test3()
	{
		System.out.println("test 3");
	}
	@Test(groups = {"regression"})
	public void test4()
	{
		System.out.println("test 4");
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


	