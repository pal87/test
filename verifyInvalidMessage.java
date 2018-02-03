package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyInvalidMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.findElement(By.id("next")).click();
         String ExpextedMessage="Please enter your email.";
         String actualmessage=driver.findElement(By.xpath("//span[contains(text(),'Please enter your email.')]")).getText();
         if(ExpextedMessage.equals(actualmessage)){
        	 System.out.println("test case is passed");
         }
         else{
        	 System.out.println("test case is failed");
	}
	}
}
