package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class download3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver ;
		
	       
	        FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("browser.download.dir", "C:\\Users\\P743411\\Desktop\\test");
		profile.setPreference("browser.download.folderList", 2);
 
		//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"); 
 
		profile.setPreference( "browser.download.manager.showWhenStarting", false );
		profile.setPreference( "pdfjs.disabled", true );
 
		//Pass FProfile parameter In webdriver to use preferences to download file.
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
		 driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// Open APP to download application
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// Click to download 
		String text=driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).click();
		//Halting the execution for 5 secs to donwload the file completely
		
 
//		driver.close();

	}

}
