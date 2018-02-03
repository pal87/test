package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.get("https://www.flipkart.com/lenovo-phab-2-store?otracker=hp_banner_widget_0");
         WebDriverWait wait=new WebDriverWait(driver,20);
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log In")));
         System.out.println("link is present");
         Actions act=new Actions(driver);
       WebElement wb =  driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
       act.moveToElement(wb).build().perform();
       act.clickAndHold(wb).build().perform();
       act.contextClick(wb).build().perform();

	}

}
