package project;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Register extends Setup{
	//Register new account
	
	@Test
	public static void CreateAccount() {
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	
		driver.findElement(By.id("customer.firstName")).sendKeys("Insoke");
		driver.findElement(By.id("customer.lastName")).sendKeys("Stha");	
		driver.findElement(By.name("customer.address.street")).sendKeys("Lazimpat");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Kathmandu");
		driver.findElement(By.id("customer.address.state")).sendKeys("Bagmati");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("44600");
		driver.findElement(By.xpath("(//input[@class='input'])[9]")).sendKeys("985107139");
		driver.findElement(By.id("customer.ssn")).sendKeys("804073");
		
		driver.findElement(By.name("customer.username")).sendKeys("Insoke_Stha");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shrestha123");
		driver.findElement(By.cssSelector("#repeatedPassword")).sendKeys("Shrestha123");
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
	}
	
	

}
