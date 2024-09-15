package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends Setup{ //main home page
	@BeforeClass
	public static void log_in(){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Insoke_Stha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shrestha123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}
	
	@Test
	//opening saving account and checking its details
public static void aopen_newacc() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		Select type=new Select(driver.findElement(By.xpath("//select[@id='type']")));
		type.selectByVisibleText("SAVINGS");
		Select funds=new Select(driver.findElement(By.cssSelector("#fromAccountId")));
		funds.selectByIndex(0);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		driver.findElement(By.xpath("//a[@id='newAccountId']")).click();
	
		
		Select activity=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		activity.selectByVisibleText("All");
		
		Select typ=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		typ.selectByIndex(0);
		
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//input[@type='submit']")); //scrolling down to submit button 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Funds Transfer Received')]")).click();			
	
		Thread.sleep(200);
		
		}
	//requesting for loan
	@Test
	public static void brequest_loan() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Request Loan')]")).click();
		driver.findElement(By.cssSelector("#amount")).sendKeys("1650");
		driver.findElement(By.cssSelector("#downPayment")).sendKeys("150");
		Select acc_no=new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		acc_no.selectByIndex(0);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		Thread.sleep(2000);
		
		
	}
	
	//transferring funds to another account
	@Test
	public static void cfund_transfer() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
		driver.findElement(By.cssSelector("#amount")).sendKeys("70");
		Select credit=new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		credit.selectByIndex(0);
		Select debit=new Select(driver.findElement(By.cssSelector("#toAccountId")));
		debit.selectByIndex(0);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
	}
	
	
	
	//overview of the loan and transaction done
	@AfterClass
	public static void acc_overview() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
		
		Thread.sleep(2000);
		
	}
	
	

		
		
		

}

