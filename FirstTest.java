package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

	public static void main(String[] args) {
		 
         System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.get("http://irctc-pnr-status.com/");
   
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.findElement(By.id("pnr_status")).click();
      
         WebDriverWait wait = new WebDriverWait(driver, 2);
         try{
             wait.until(ExpectedConditions.alertIsPresent());
             Alert alert = driver.switchTo().alert();
             alert.accept();
         }
         catch (Exception e){
             System.out.println("No alert");
         }
        

      

	}

}
