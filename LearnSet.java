package week3.day3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSet {
	
public static void main(String[] args) {
		
		// set the system property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// open the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");

		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Get all the Train Names  
		List<WebElement> trainNum = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][1]");
		
		//Hashset
		Set<String> tn = new HashSet<String>();
		
		//Iterating each train with for each loop
		for (WebElement eachTrain : trainNum) {
			String train = eachTrain.getText();
			tn.add(train);
		}
		
		System.out.println(tn);
		
		// Confirm no duplicates
		if(trainNum.size() == tn.size()) {
			System.out.println("No duplicates");
		}
		
		// Close the browser
		driver.close();
		
		//output- [22625, 16021, 17311, 12292, 12296, 12691, 22682, 22698, 22601, 22502, 12639, 06222, 12504, 12609, 12607, 22351, 12510, 12552, 12027, 12657, 12577, 15228, 12007]
		//		No duplicates

	}

}
