package testing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class attachFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.get("https://mail.google.com/mail/u/0/#inbox?compose=new");
        driver.findElement(By.id("Email")).sendKeys("payel.gkcem");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        
        driver.findElement(By.id("next")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.id("Passwd")).sendKeys("trend@123");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.id("signIn")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        
       
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
       driver.findElement(By.id(":q1")).click();
       driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
      Runtime.getRuntime().exec("C:\\Users\\P743411\\Desktop\\attach1.exe");
     
	}

}
