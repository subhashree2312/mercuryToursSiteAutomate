package mercuryTours.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class third {
	By depart3 =By.xpath("(//*[@type='radio'])[3]");
	By return2=By.xpath("(//*[@type='radio'])[6]");
	By depatname=By.xpath("(//*[@class='frame_action_xrows'])[3]/../td[2]/font/b");
	By depattime=By.xpath("(//*[@class='frame_action_xrows'])[3]/../td[3]/*");
	By depatstop=By.xpath("(//*[@class='frame_action_xrows'])[3]/../td[4]/*");
	By returnname=By.xpath("(//*[@class='frame_action_xrows'])[6]/../td[2]/font/b");
	By returntime=By.xpath("(//*[@class='frame_action_xrows'])[6]/../td[3]/*");
	By returnstop=By.xpath("(//*[@class='frame_action_xrows'])[6]/../td[4]/*");
	By reserveFlights=By.name("reserveFlights");
	String depart[]= new String[3];
	String retur[]=new String[3];
	
	public void selectFlight(WebDriver driver){
		driver.findElement(depart3).click();
		driver.findElement(return2).click();
		depart[0]=driver.findElement(depatname).getText();
		depart[1]=driver.findElement(depattime).getText();
		depart[2]=driver.findElement(depatstop).getText();
		retur[0]=driver.findElement(returnname).getText();
		retur[0]=driver.findElement(returntime).getText();
		retur[0]=driver.findElement(returnstop).getText();
		System.out.println("The Depart Flight Name, Time and Stop are:");
		for (int i = 0; i< depart.length; i++) {
			System.out.println(depart[i]);
		}
		System.out.println("The return Flight Name,Time and Stop are:");
		for (int j = 0; j< retur.length; j++) {
			System.out.println(retur[j]);
		}
		
		driver.findElement(reserveFlights).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	

}
