package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
		//WebElement CreateAccount = driver.findElement(By.xpath("//*[contains(text(),'share with the people']"));
		//WebElement Starts = driver.findElement(By.xpath("//*[starts-with(text(),'Facebook helps ')]"));
		
		UserName.sendKeys("xyz@abc.com");
        Password.sendKeys("Abc@12345");
        Login.click();
        
	}
	
}
