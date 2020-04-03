package week1day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusProject {
	
	public static void main(String[] args) throws InterruptedException {
// set the system property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				
//open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
//Maximize the screen
		driver.manage().window().maximize();
		
//implicit wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//Launch URL:
		driver.get("https://www.redbus.in/");
		
//From-Chennai 
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(4000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		
//to-bangalore
	    driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(4000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		
//onward date as 30th
		driver.findElementByXPath("(//div[contains(@class,'fl search-box')]//span)[3]").click();
		driver.findElementByXPath("(//td[text()='30'])[2]").click();
		driver.findElementById("search_btn").click();
		
//Search Buses
		driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[2]").click();
		driver.findElementByXPath("//label[@title='SLEEPER']").click();
		driver.findElementByLinkText("Seats Available").click();
		System.out.println("Seats Available");
		
//close the browser
		driver.close();
	}

}
