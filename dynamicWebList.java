package testing;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class dynamicWebList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        WebElement wb=driver.findElement(By.id("Month"));
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        
        Select sel=new Select(wb);
       sel.selectByVisibleText("Feb");
       
        List<WebElement> list=sel.getOptions();
        System.out.println(list.size());
        String expectedtext="Feb";
        for(int i=0;i<=list.size();i++){
        	String actualtext=list.get(i).getText();
        	if(expectedtext.equals(actualtext)){
        		sel.selectByVisibleText(actualtext);
        		break;
        		
        	}
        	
        }
        
      
       
	}

}
