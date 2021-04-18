package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String baseURL="https://s1.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";


	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("############### TEST Started SUCCESSFULLY ###############", true);
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@AfterClass
	public void tearDown() {
		driver.close();
		Reporter.log("############### TEST COMPLETED SUCCESSFULLY ###############", true);
	}

	public static void main(String agrs[]) {

	}

}