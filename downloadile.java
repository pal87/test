package testing;

import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadile {

	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.dir", "C:\\Users\\P743411\\Desktop\\ECC TRAINING");
		profile.setPreference("browser.download.folderList", 2);
 
		//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/zip"); 
 
		profile.setPreference( "browser.download.manager.showWhenStarting", false );
		profile.setPreference( "pdfjs.disabled", true );
 
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
        WebDriver driver = new FirefoxDriver(profile);
     //driver.get("http://toolsqa.com/automation-practice-form/");
        
		// Click to download 
		//driver.findElement(By.linkText("Test File to Download")).click();
	    //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
	  
		
		// TODO Auto-generated catch block
			
		//Halting the execution for 5 secs to donwload the file completely
		
 
		//driver.close();
		driver.get("http://www.seleniumhq.org/download/");
		driver. manage(). window().maximize();
	
			
		 driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
	WebElement wb =	driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a"));
	System.out.println("find element");
	driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
	wb.click();
	//e.printStackTrace();
		}
		// TODO Auto-generated method stub
		

	}


