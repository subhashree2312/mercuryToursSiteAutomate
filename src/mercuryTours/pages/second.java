package mercuryTours.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class second {
	By hotels =By.xpath("(//*[@class='mouseOut'])[2]/td[2]/a");
	By flights =By.xpath("(//*[@class='mouseOut'])[2]/td[2]/a");
	By oneway=By.xpath("(//*[@type='radio'][2])[1]");
	By passengers=By.name("passCount");
	By from=By.name("fromPort");
	By to=By.name("toPort");
	By frommonth=By.name("fromMonth");
	By fromdate=By.name("fromDay");
	By business=By.xpath("(//*[@type='radio'][1])[3]");
	By findFlights=By.name("findFlights");
	
	public void searchFlight(WebDriver driver){
		driver.findElement(hotels).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(flights).click();
		driver.findElement(oneway).click();
		driver.findElement(passengers).sendKeys("2");
		driver.findElement(from).sendKeys("London");
		driver.findElement(to).sendKeys("Paris");
		driver.findElement(frommonth).sendKeys("8");
		driver.findElement(fromdate).sendKeys("22");
		driver.findElement(business).click();
		driver.findElement(findFlights).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		

}
