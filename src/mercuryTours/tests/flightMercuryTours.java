package mercuryTours.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import mercuryTours.pages.fifth;
import mercuryTours.pages.first;
import mercuryTours.pages.fourth;
import mercuryTours.pages.second;
import mercuryTours.pages.third;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightMercuryTours {
	public static void main(String args[]) throws IOException{
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		first f1=new first();
		second f2=new second();
		third f3=new third();
		fourth f4=new fourth();
		fifth f5=new fifth();
		f1.login(driver);
		f2.searchFlight(driver);
		f3.selectFlight(driver);
		f4.passengersDetails(driver);
		f5.confirm(driver);
		driver.quit();
	}

}
