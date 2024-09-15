package project;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	public static String url="https://parabank.parasoft.com/parabank/index.htm";
	public static ChromeDriver driver;
	@BeforeSuite
	public static void browseropen() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(url);
		
		
	}
	@AfterSuite
	public static void browserclose() throws InterruptedException {
		Thread.sleep(9000);
		driver.close();
	}
	
	

}
