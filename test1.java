package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		 
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         driver.navigate().to("http://jqueryui.com/droppable/");
 		//Wait for the frame to be available and switch to it
 		WebDriverWait wait = new WebDriverWait(driver, 5);
 		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
 		WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
 		WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
 		Actions act=new Actions(driver);
 		act.dragAndDrop(Sourcelocator,Destinationlocator);
 		String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
 		
		// TODO Auto-generated method stub

	}

}
