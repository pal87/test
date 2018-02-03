package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");// TODO Auto-generated method stub
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         WebElement element ;

         element = driver.findElement(By.xpath("//div[@id='demon_content']/div[2]/input")); 
        element.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getClass());
        System.out.println(driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//a[text()='Tourist Train']")).click();
	}

}
