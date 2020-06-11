package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest implements AutoConstant 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty(chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	@BeforeClass
	public void start()
	{
		System.out.println("execution getting started");
	}
	

}
