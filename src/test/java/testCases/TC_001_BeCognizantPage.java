package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BeCognizantPage;
import Utility.ScreenShots;
import testBase.BaseClass;

public class TC_001_BeCognizantPage extends BaseClass{
	
	@Test
	public void beCognizantValidation() throws IOException, InterruptedException
	{   
		//profile validation
		BeCognizantPage bcp = new BeCognizantPage(driver);
		bcp.ClickOnProfile();
		
		Thread.sleep(8000);
		
		ScreenShots ss = new ScreenShots(driver);
		ss.ScreenShot("profileInfo");
		
		//News Header and tool-tip validation
		bcp.newsHeaderVisibility();
		
		
		
	}
	
		
	

}
