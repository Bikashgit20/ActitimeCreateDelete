package POM;

import java.io.IOException;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitime extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement submit;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settings;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofwork;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement work;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
//	@FindBy(xpath="(//input[@type='submit'])")
//	private WebElement newwork;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancel;
	
	
	public PomActitime(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() throws IOException
	{
		username.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
		password.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		submit.click();
		
	}
	public void creatework() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		settings.click();
		typesofwork.click();
		work.click();
		name.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 2));
		cancel.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//pop();
	}
}
	



