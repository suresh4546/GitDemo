package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubPagePF {

WebDriver driver;

public GitHubPagePF(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}

//By userName =By.xpath("//input[@id='login_field']");
//By passWord =By.xpath("//input[@id='password']");
//By signInbtn =By.xpath("//input[@value='Sign in']");


@FindBy(xpath="//input[@id='login_field']")
WebElement userName;

@FindBy(xpath="//input[@id='password']")
WebElement passWord;

@FindBy(xpath="//input[@value='Sign in']")
WebElement signInbtn;

@FindBy(xpath="//a[@target='_blank' and contains(text(),'Read the guide')]")
WebElement readGuideButton;




public WebElement userNameFun() {
	return userName;
}

public WebElement passWordFun() {
	return passWord;
}

public WebElement signInbtnFun() {
	return signInbtn;
	
}

public WebElement readGuideButtonFun() {
	
	return readGuideButton;
}

}

