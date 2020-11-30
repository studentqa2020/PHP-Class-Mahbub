package com.generic.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.model.MasterPageFactory;
import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.SeleniumWait;

public class BaseLogin {

	public static WebDriver getDriverManager () throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getConfigValue("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		return driver;
	}
		public static WebDriver getLogin(WebDriver driver) throws Throwable {
		
		MasterPageFactory pf =new MasterPageFactory(driver);
		HighLighter.getcolor(driver, pf.getMyaccount());
		SeleniumWait.getExplicitWait(driver, pf.getMyaccount());
		pf.getMyaccount().click();
		HighLighter.getcolor(driver, pf.getLogin());
		SeleniumWait.getExplicitWait(driver, pf.getLogin());
		pf.getLogin().click();
		HighLighter.getcolor(driver, pf.getEmall());
		pf.getEmall().sendKeys(BaseConfig.getConfigValue("email"));
		HighLighter.getcolor(driver, pf.getPassword());
		pf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		HighLighter.getcolor(driver, pf.getSignin());
		SeleniumWait.getExplicitWait(driver, pf.getSignin());
		pf.getSignin().click();

		return driver;
}
}