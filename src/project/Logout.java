package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

//scroll down to logout bottom and logout
public class Logout extends Login {
	@Test
	public static void acc_logout() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}