package com.page.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

public MasterPageFactory(WebDriver driver) {
	
PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[@class='dropdown dropdown-login dropdown-tab']")
    private WebElement myaccount;

    @FindBy(xpath="//*[@class='dropdown-item active tr']")
    private WebElement Login;

    @FindBy(xpath="//*[@name='username']")
	private WebElement Emall;
	
    @FindBy(xpath="//*[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//*[@class='btn btn-primary btn-lg btn-block loginbtn']")
	private WebElement Signin;

	public WebElement getMyaccount() {
		return myaccount;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getEmall() {
		return Emall;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignin() {
		return Signin;
	}
}
