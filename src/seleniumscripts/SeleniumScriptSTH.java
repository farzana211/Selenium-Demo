/*
 Scenario:
 Open url, verify title page and login to the account and close the browser
 Steps:
 1. open browser
 2. enter url
 3. verify page title
 4. enter username
 5. enter password
 6. click on login
 7. close browser
 Test data:
 URL: http://dbankdemo.com/login
 expectedTitle: Digital Bank
 username:james@gmail.com
 password:Abcd1234#
 */

package seleniumscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*public class SeleniumScriptSTH {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "http://dbankdemo.com/login";
		String expectedTitle = "Digital Bank";
		String username = "james@gmail.com";
		String password = "Abcd1234#";
		String actualTitle = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.get(url);
			actualTitle = driver.getTitle();
			Thread.sleep(5000);
			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Expected title is:" + expectedTitle);
				System.out.println("Actual title is:" + actualTitle);
				System.out.println("Verification successfull-Correct title is dispalced on the web page ");
			} else {
				System.out.println("Expected title is:" + expectedTitle);
				System.out.println("Actual title is:" + actualTitle);
				System.out.println("Verification unsuccessfull-Correct title is not dispalced on the web page ");
			}
			Thread.sleep(5000);
			driver.findElement(By.id("username")).sendKeys(username);
			Thread.sleep(5000);
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(5000);
			driver.findElement(By.id("submit")).click();
			Thread.sleep(5000);
			driver.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
	}

}
/*
  ___________________________________________________________________________________________________________________
 Another script:
 
*/
public class SeleniumScriptSTH {

	public static void main(String[] args) {
		WebDriver driver;
		String url1 = "http://dbankdemo.com/login";
		String expectedTitle1 = "Digital Bank";
		String username1 = "james@gmail.com";
		String password1 = "Abcd1234#";
		String actualTitle = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.get(url1);
			actualTitle = driver.getTitle();
			Thread.sleep(5000);
			if (expectedTitle1.equals(actualTitle)) {
				System.out.println("Expected title is:" + expectedTitle1);
				System.out.println("Actual title is:" + actualTitle);
				System.out.println("Verification successfull-Correct title is dispalced on the web page ");
			} else {
				System.out.println("Expected title is:" + expectedTitle1);
				System.out.println("Actual title is:" + actualTitle);
				System.out.println("Verification unsuccessfull-Correct title is not dispalced on the web page ");
			}
			Thread.sleep(5000);
			WebElement uname=driver.findElement(By.id("username"));
			uname.clear();
			uname.sendKeys(username1);
			
			Thread.sleep(5000);
			WebElement pwd= driver.findElement(By.id("password"));
			pwd.clear();
			pwd.sendKeys(password1);
			
			Thread.sleep(5000);
			WebElement signin= driver.findElement(By.id("submit"));
			signin.click();
			Thread.sleep(5000);
			driver.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
	}

}