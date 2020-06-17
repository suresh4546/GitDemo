package testCaseforPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectrepository.GitHubPage;
import objectrepository.GitHubPagePF;

public class LoginGitHubTest {

	WebDriver driver;

	@BeforeMethod
	public void setUP() {

		System.setProperty("webdriver.chrome.driver", "F:\\javaChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://github.com/login");

	}
	
	@Test
	public void doLogin() {
		//GitHubPage ghp = new GitHubPage(driver); 
		GitHubPagePF gpf= new GitHubPagePF(driver);
		gpf.userNameFun().sendKeys("githubsuresh4546@gmail.com");
		gpf.passWordFun().sendKeys("Khan4546");
		gpf.signInbtnFun().click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
