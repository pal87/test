package testing;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {
	public static WebDriver driver ;

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
      driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        try {
			getscreenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}
	  public static void getscreenshot() throws Exception 
      {
              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //The below method will save the screen shot in d drive with name "screenshot.png"
              FileUtils.copyFile(scrFile, new File("C:\\Users\\P743411\\Desktop\\test\\TEST.png"));
      }

}
