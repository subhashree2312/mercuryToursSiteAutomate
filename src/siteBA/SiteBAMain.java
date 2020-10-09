package siteBA;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteBAMain {

	public static void main(String args[]) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.britishairways.com/travel/home/public/en_in");
		Thread.sleep(5000);
		driver.findElement(By.id("carsTab")).click();
		driver.findElement(By.id("planTripCarDestination")).sendKeys("New York");
		Thread.sleep(2000);
		List<WebElement> location=driver.findElements(By.id("AIR_EWR_NJ_US"));
		for (WebElement selectOption : location) 
			selectOption.click();	
		Thread.sleep(2000);
		WebElement pickup=driver.findElement(By.id("pickUpGO"));
		pickup.sendKeys("03/07/16");
		pickup.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		pickup.sendKeys(Keys.TAB);
		driver.findElement(By.id("dropOffGO")).click();
		WebElement dropOff=driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> date=dropOff.findElements(By.tagName("td"));
		for (WebElement dropdate: date) {
			if(dropdate.getText().equals("13"))
				dropdate.findElement(By.linkText("13")).click();
		}
		driver.findElement(By.id("carSearchButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("accept_ba_cookies")).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("packageDiv5")));
		String price=driver.findElement(By.xpath("//*[@id='packageDiv5']//*[@id='totalPricePackLinkBA']")).getText();
		System.out.println("The Price of the Third Car is:"+price);
		String type=driver.findElement(By.xpath("//*[@id='packageDiv5']//*[@class='btmMarginMedium']")).getText();
		System.out.println("The Type of the Third Car is:"+type);
		String name=driver.findElement(By.xpath("//*[@id='packageDiv5']//*[@class='carAvisIcon']")).getAttribute("title");
		System.out.println("The Price of the Third Car is:"+name);
		driver.findElement(By.xpath("//*[@id='packageDiv5']//*[@class='CaC']")).click();
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:/Selenium_Work/Screenshot_SBA/finalScreen.png"));
	}

}
