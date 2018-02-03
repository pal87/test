package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class facebbok {

	public static void main(String[] args) {
		 System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
	     // WebDriver driver = new FirefoxDriver();
		 WebDriver driver;
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\P743411\\Desktop\\eCC Console\\ConsoleAutomation.Test\\Dependencies\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
	      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	      driver.get("https://mreconsolegui.rd.allscripts.com/account/login?timeOut=1");
	
	      
	      // TODO Auto-generated method stub

	}

}
