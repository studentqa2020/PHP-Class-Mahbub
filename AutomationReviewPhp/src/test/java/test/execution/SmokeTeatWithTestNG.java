package test.execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;

public class SmokeTeatWithTestNG {
	WebDriver driver;

	@BeforeTest
	public void getDriverSetup() throws Throwable {
		driver = BaseLogin.getDriverManager();
	}

	@Test
	public void getTest() throws Throwable {
		driver = BaseLogin.getLogin(driver);
	}

	@AfterTest
	public void getClose() {

		driver.quit();

	}

}


