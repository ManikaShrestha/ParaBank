package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class forgot_password extends Setup {
	
	//if password is forgotten, login by entering details
	@Test
	public static void password_info() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Forgot login info?')]")).click();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Insoke");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Stha");
		driver.findElement(By.xpath("(//input[@class='input'])[5]")).sendKeys("Lazimpat");
		driver.findElement(By.xpath("//input[@id='address.city']")).sendKeys("Kathmandu");
		driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys("Bagmati");
		driver.findElement(By.name("address.zipCode")).sendKeys("44600");
		driver.findElement(By.cssSelector("#ssn")).sendKeys("804073");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'about')]")));
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'about')]"));
		element.click();

		
		}

}
