package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubPage {

WebDriver driver;

public GitHubPage(WebDriver driver) {
	this.driver=driver;
	
}

By userName =By.xpath("//input[@id='login_field']");
By passWord =By.xpath("//input[@id='password']");
By signInbtn =By.xpath("//input[@value='Sign in']");



public WebElement userNameFun() {
	return driver.findElement(userName);
}

public WebElement passWordFun() {
	return driver.findElement(passWord);
}

public WebElement signInbtnFun() {
	return driver.findElement(signInbtn);
	
}


}

