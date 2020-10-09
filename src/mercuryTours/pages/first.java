package mercuryTours.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class first {
	By userName =By.name("userName");
	By password=By.name("password");
	By login=By.name("login");
	
	public void login(WebDriver driver){
		driver.findElement(userName).sendKeys("academy");
		driver.findElement(password).sendKeys("academy");
		driver.findElement(login).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	

}
