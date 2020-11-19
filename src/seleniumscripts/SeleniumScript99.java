
/*Scenario:
	To open URL and verify the title page
	Steps:
	1. open Chrome browser
	2. go to specified URL
	3. Verify the title and print the output of the title
	4. Close the browser
	
	Test Data:
	URL: http://dbankdemo.com/login
	Expected Value: Digital Bank
	
	
	


*/
package seleniumscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript99 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url = "http://dbankdemo.com/login";
		String expectedTitle = "Digital Bank";
		String actualTitle = null;
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(url);
		actualTitle = driver.getTitle();
		Thread.sleep(3000);
		//System.out.println(actualTitle);
		Thread.sleep(3000);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Expected title is:" + expectedTitle);
			System.out.println("Actual title is:" + actualTitle);
			System.out.println("Test is passed");
		} else {
			System.out.println("Expected title is:" + expectedTitle);
			System.out.println("Actual title is:" + actualTitle);
			System.out.println("Test is failed");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
