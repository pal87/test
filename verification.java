package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C://Users//P743411//Desktop//sekenium//geckodriver-v0.11.1-win64//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
       
      // boolean flag=driver.findElement(By.xpath("//a[@title='Go to Facebook home']").isDisplayed();
      // System.out.println(flag);
      System.out.println(driver.findElement(By.id("u_0_1")).getAttribute("aria-label"));
      boolean flag1=driver.findElement(By.id("u_0_h")).isSelected();
      System.out.println(flag1);
      List<WebElement> links = driver.findElements(By.tagName("a"));
      
		System.out.println(links.size());

		for (int i = 1; i<=links.size(); i=i+1)

		{

			System.out.println(links.get(i).getText());
			if(links.get(i).getText().contains("Log")){
				System.out.println("link is resent");
				break;
			}

		}
		
		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=SkxUWIClNuit8weljISIBQ");
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	Boolean flag2=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(flag2);

	}

}
