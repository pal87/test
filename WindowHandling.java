package testing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
         WebElement wb1=driver.findElement(By.id("irctc_tourism"));
         Actions act=new Actions(driver);
         act.moveToElement(wb1).build().perform();
        System.out.println("--------------");
       driver.findElement(By.linkText("Tourist Train")).click();
         //driver.findElement(By.xpath(".//*[@id='bluemenu']/ul/li[8]/ul/li[4]/a")).click();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
       
 		Set<String> windowId=driver.getWindowHandles();
 		Iterator<String>  it=windowId.iterator();
 		String parentid=it.next();
 		String childid=it.next();
 		System.out.println("parentid"+parentid);
 		System.out.println("childid"+childid);
 		driver.switchTo().window(childid);
 		driver.findElement(By.xpath("//div[span[@class='fleft w60p']/h1[contains(text(),'Buddhist Circuit Tourist Train')]]/span/a")).click();
 		
 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 		Set<String> windowId1=driver.getWindowHandles();
 		Iterator<String>  it1=windowId1.iterator();
 		String parentid1=it1.next();
 		String childid1=it.next();
 		System.out.println("parentid1"+parentid);
 		System.out.println("childid1"+childid);
 		driver.switchTo().window(childid1);
 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 		String text=driver.findElement(By.xpath("//div[@class='rightbotcont']")).getText();
 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 		System.out.println(text);

		
}}
