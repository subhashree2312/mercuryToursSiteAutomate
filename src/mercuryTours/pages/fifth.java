package mercuryTours.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class fifth {
	By confirmmsg =By.xpath("//*[@size='+1']");
	By totalAmount=By.xpath("(//*[@size='2' and @color='#000000'])[5]");
	By logout=By.xpath("//*[@href='mercurysignoff.php']/img");
	
	public void confirm(WebDriver driver) throws IOException{
		Assert.assertTrue("Verify Your itinerary has been booked! is Displayed", driver.findElement(confirmmsg).isDisplayed());
		System.out.println("The total Amount with tax is : "+driver.findElement(totalAmount).getText());
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:/Selenium_Work/SBA_Test/Screenshots/Mercury_Tours_Final.png"));
		driver.findElement(logout);
		File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshots, new File("E:/Selenium_Work/SBA_Test/Screenshots/Mercury_Tours_Logout.png"));
	}
	

}
