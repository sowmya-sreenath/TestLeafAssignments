package wweek4.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProjPart1 {
	
public static void main(String[] args) throws InterruptedException {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://dev92474.service-now.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		1. Launch the ServiceNow application:
//		Switch to Frame
		driver.switchTo().frame("gsft_main");
		
		
//		2. Login with valid credentials username as admin and password as India@123
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		
		driver.findElementById("sysverb_login").click();
		
		
//		3. Enter Change in filter navigator and press enter
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Change", Keys.ENTER);
		Thread.sleep(2000);
		
		
//		4. Click on Create new option Under Change
		driver.findElementByXPath("(//div[text()='Create New'])[3]").click();
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		
//		5. Click on the 1st hyperlink
		driver.findElementByPartialLinkText("Changes without predefined").click();
		
		
//		6. Get the CHG No
		WebElement requestNumber = driver.findElementById("change_request.number");
		String text = requestNumber.getAttribute("value");
		System.out.println("Incident No Original: " + text);
		
		
//		7. Enter the Mandatory field "Short Description"
		driver.findElementByXPath("//input[@id='change_request.short_description']").sendKeys("Service Now Exercise Part 1");
		
		
//		8. Click on the Submit Button
		driver.findElementByXPath("(//button[@id='sysverb_insert'])[1]").click();
		
		
//		9. Enter The Incident Number Newly created in Search Field and Press Enter
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(text, Keys.ENTER);
		Thread.sleep(2000);
		
		
//		10. Verify the Incident Number
		WebElement requestNumber1 = driver.findElementByXPath("//a[@class='linked formlink']");
		String text2 = requestNumber1.getText();
		System.out.println("Retreiving Incident No: " + text2);

		if (text.equals(text2)) {
			System.out.println("Incident Number is Matching");
		} else {
			System.out.println("Incident Number is Not Matching");
		}
		// Close the browser
				driver.close();
	}

}
