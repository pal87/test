package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.get("https://www.facebook.com/");
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        WebElement wb= driver.findElement(By.id("day"));
        Select sel=new Select(wb);
       sel.selectByIndex(1);
       WebElement wb1= driver.findElement(By.id("month"));
       Select sel1=new Select(wb1);
      sel1.selectByVisibleText("Feb");
      WebElement wb2= driver.findElement(By.id("year"));
      Select sel2=new Select(wb2);
     sel2.selectByValue("2016");
     if(sel2.isMultiple()){
    	 System.out.println("it is a multi select dropdown");
     }
     System.out.println("it is not multi select dropdown");
 
	}
	
	
}
