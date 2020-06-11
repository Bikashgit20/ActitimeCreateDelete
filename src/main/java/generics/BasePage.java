package generics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BasePage implements AutoConstant 
{
	public WebDriver driver;
	public void pop() throws InterruptedException
	{
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(10000);
		System.out.println(alt.getText());
		alt.accept();
	}
		
	
	

}