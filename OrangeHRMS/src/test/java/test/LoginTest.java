package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(priority =1)
	public void validateLoginPage(){
		String expectedTitle = driver.getTitle();
		assertEquals(expectedTitle, "OrangeHRM");
	}
	
	@Test(priority =2)
	public void validateLoginCredentials() throws Exception{
		driver.findElement(By.xpath(".//*[@name='txtUsername']")).click();
		driver.findElement(By.xpath(".//*[@name='txtUsername']")).sendKeys("opensourcecms");
		
		driver.findElement(By.id("divPassword")).click();
		driver.findElement(By.xpath(".//*[@name='txtPassword']")).sendKeys("opensourcecms");
		
		driver.findElement(By.id("btnLogin")).click();
		String expectedTile = driver.getTitle();
		
		assertEquals(expectedTile, "OrangeHRM");
	}

	

}
