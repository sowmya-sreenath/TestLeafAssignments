package week1day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment1 {

	public static void main(String[] args) {
		// set the system property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				
		//open the chrome browser
		ChromeDriver driver = new ChromeDriver();
				
		// Opening the URL
		driver.get("https://acme-test.uipath.com/account/login");
				
		// Implicit wait - 10 seconds
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Enter Email
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
				
		// Enter password
		driver.findElementById("password").sendKeys("leaf@12");
		
		// Click Login
		driver.findElementById("buttonLogin").click();
		
		// Mouse over on Vendors using ready syntax
		 
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");  
		Actions act = new Actions(driver);  
		act.moveToElement(ele).perform();
		
		// Click search vendor
		driver.findElementByLinkText("Search for Vendor").click();
		
		// Enter vendor name
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		// Click search
		driver.findElementById("buttonSearch").click();
		
		// Find country name
		String country = driver.findElementByXPath("(//table[@class='table']//td)[5]").getText();
		System.out.println(country);
		
		//Logout
		driver.findElementByLinkText("Log Out").click();
		
		// CLose browser
		driver.close();
	}

}





	
	
				
				
	