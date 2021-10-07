package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
@Test
	public void newLead()  {

	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	driver.findElement(By.name("submitButton")).click();
//	//Thread.sleep(5000);
	
	
		
	
	
}
}
