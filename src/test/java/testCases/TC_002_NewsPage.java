package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.NewsPage;
import Utility.ScreenShots;
import testBase.BaseClass;

public class TC_002_NewsPage extends BaseClass{
	
	@Test
	public void newsPageValidation() throws InterruptedException, IOException
	{
		ScreenShots ss = new ScreenShots(driver);
		NewsPage nsp = new NewsPage(driver);
		int newssize = nsp.newsSize();
		
		for(int i=0;i<newssize-1;i++)
		{
			nsp.clickEachNews(i);
			Thread.sleep(2000);
			ss.ScreenShot("News"+i);
			nsp.showNewsDetails();
			nsp.associateDetails();
			ss.ScreenShot("associateDetails"+i);
			nsp.hyperlinkValidation();
			nsp.shareBtnOptions();
			ss.ScreenShot("shareBtn"+i);
			nsp.likesAndViews();
		}
	
				
	
		
	}

}
