package seleniumscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		List<WebElement> Buttonlist = driver.findElements(By.tagName("button"));
		System.out.println("Total button of the page are:" + Buttonlist.size());
		for (int i = 0; i < Buttonlist.size(); i++) {
			String buttonName = Buttonlist.get(i).getText();
			System.out.println(buttonName);

			driver.close();
		}

	}

}
