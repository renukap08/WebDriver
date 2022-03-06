package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		        
		        WebDriver driver = new ChromeDriver();
		        //WebDriver driver = new FirefoxDriver();
		        driver.get("https://demoqa.com/browser-windows");    
		        
//Maximize window
		        driver.manage().window().maximize();
		        
//wait for browser to load - implicit
		        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		        
//relative xpath locator
		        
		        WebElement element = driver.findElement(By.xpath("//button[@id='windowButton']"));
		        element.click();
		        
		        Set<String> handles = driver.getWindowHandles();
		        Iterator<String> itr = handles.iterator();
		        
		        while(itr.hasNext())   {
		        	
		        	String currentVal = itr.next();
		        	System.out.println(currentVal);
		        	
		        	Object ParentWin = null;
					if(!currentVal.equals(ParentWin)) {
		                
		                driver.switchTo().window(currentVal);
		            }
		        }
		        
		        WebElement heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		        System.out.println(heading.getText());
		        driver.close();

		    }
}
