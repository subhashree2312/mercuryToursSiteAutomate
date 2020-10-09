package mercuryTours.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fourth {
	By p1f =By.name("passFirst0");
	By p1l=By.name("passLast0");
	By s1f =By.name("passFirst1");
	By s1l=By.name("passLast1");
	By card=By.name("creditnumber");
	By submit=By.name("buyFlights");
	
	public void passengersDetails(WebDriver driver){
		driver.findElement(p1f).sendKeys("First1");
		driver.findElement(p1l).sendKeys("First2");
		driver.findElement(s1f).sendKeys("Second1");
		driver.findElement(s1l).sendKeys("Second2");
		driver.findElement(card).sendKeys("6011456945694569");
		driver.findElement(submit).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	

}
