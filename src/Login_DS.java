import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_DS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(10000);
	    driver.get("http://dbankdemo.com/login?logout");
	    driver.findElement(By.id("username")).sendKeys("james@gmail.com");
		Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys("Abcd1234#");
		Thread.sleep(3000);
	    driver.findElement(By.id("submit")).click();
	   // driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']")).click();
	    
	}

}
