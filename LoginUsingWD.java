package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingWD {

	public static void main(String[] args) {
		
		//add system properties webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//open the chrome browser
		//chromeDriver (C) by Se test
		ChromeDriver driver = new ChromeDriver();
		
		//load the url :: get
		driver.get("http://leaftaps.com/opentaps/control/main");
		//navigate backwRDS
		driver.navigate().back();
		
		//print the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Refresh the screen/page
		driver.navigate().refresh();
		//driver.get("https://google.co.in"); // get() & navigate().to() are same
		driver.navigate().to("https://google.co.in");
		
		//close the browser
		driver.close();
		
		
		//Locators
				// find user name
				WebElement eleUserName = (WebElement) driver.findElementsById("username");
				eleUserName.sendKeys("DemoSAlesManager");
				eleUserName.clear();//clear the content
			//Find Pwd n interact
				WebElement ele1 = driver.findElementByName("PASSWORD");
				ele1.sendKeys("crmfa");
				driver.findElementByName("PASSWORD").sendKeys("srmsfa");
				
				//click on login 
				//driver.findElementsByClassName("decorativeSubmit").click();
				
				//click on CRMSFA
				driver.findElementByPartialLinkText("CRM/SFA").click();
	}

}
