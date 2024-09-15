package project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Regiter_emptyfield extends Setup{
	//Negative Testing
	//register by leaving some of the fields empty
	@Test
	public static void blank_fields() {
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("Insoke");
		driver.findElement(By.id("customer.lastName")).sendKeys("Zen");	
		driver.findElement(By.name("customer.address.street")).sendKeys("Thamel");
		driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		driver.findElement(By.id("customer.address.state")).sendKeys("Bagmati");
		driver.findElement(By.name("customer.address.zipCode"));
		driver.findElement(By.xpath("(//input[@class='input'])[9]")).sendKeys("985410897");
		driver.findElement(By.id("customer.ssn")).sendKeys("804073");
		
		driver.findElement(By.name("customer.username")).sendKeys("Insoke_Zen");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shrestha123");
		driver.findElement(By.cssSelector("#repeatedPassword")).sendKeys("Shrestha123");
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
