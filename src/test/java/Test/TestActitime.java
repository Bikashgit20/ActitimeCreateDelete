package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.PomActitime;

import generics.BaseTest;

public class TestActitime extends BaseTest
{
	
	@Test
	public void result() throws IOException, InterruptedException
	{
		PomActitime sign=new PomActitime(driver);
		sign.login();
		sign.creatework();
		
	}
	
	
	
		
	

}
