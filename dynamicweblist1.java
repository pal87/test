package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicweblist1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
        WebElement wb1= driver.findElement(By.id("month"));
        Select sel1=new Select(wb1);
        sel1.selectByIndex(1);

        List<WebElement> list=sel1.getOptions();
        System.out.println(list.size());
        String expectedtext="Feb";
        for(int i=0;i<=list.size();i++){
        	String actualtext=list.get(i).getText();
        	if(expectedtext.equals(actualtext)){
        		sel1.selectByVisibleText(actualtext);
        		break;
        		
        	}
        	
        }

	}

}
