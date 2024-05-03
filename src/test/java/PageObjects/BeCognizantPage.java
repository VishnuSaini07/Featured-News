package PageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BeCognizantPage extends BasePage{
	
	//Constructor
		public BeCognizantPage(WebDriver driver) {
			super(driver);
		}
		
	//Elements
		//profile
//		@FindBy(xpath="//div[@id='O365_HeaderRightRegion']")
		@FindBy(id="O365_MainLink_MePhoto")
		WebElement profile;
		
		//User-name element
		@FindBy(xpath = "//div[@class='mectrl_accountDetails']/div[1]")
		WebElement txt_userName;
		
		//Email element
		@FindBy(xpath = "//div[@class='mectrl_accountDetails']/div[2]")
		WebElement txt_userEmail;
		
		//news header 
		@FindBy(xpath="//div[@class='z_a_91bed31b l_a_91bed31b']//a[@data-automation-id='newsItemTitle']")
		List<WebElement> list_news;
		
		
		
	//Actions

		
		//click On User-Info-button
		public void ClickOnProfile() throws InterruptedException, IOException
		{
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("O365_MainLink_MePhoto")));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='O365_MainLink_Settings']/div"))));
			Thread.sleep(2000);
			profile.click();
		}
		
		//check news header & tool-tip
		public void newsHeaderVisibility() throws InterruptedException
		{
			Thread.sleep(3000);
			for(WebElement e:list_news)
			{
				System.out.println("News Headline: "+e.getText());
				System.out.println("Tooltip: "+e.getAttribute("title"));				
			}
			System.out.println();
					
		}
		
		
}
