package ricoh.es.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver browser ;
        //System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        //browser = new FirefoxDriver();
        
        //System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        //browser = new ChromeDriver();
        
        System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer1.exe");
        browser = new InternetExplorerDriver();
        
        
        browser.get("http://www.google.com");
        
        WebDriverWait wait = new WebDriverWait(browser, 10);

        WebElement element;
        
        element = wait.until(ExpectedConditions.elementToBeClickable(By.id("lst-ib")));
        
        element.sendKeys("ricoh");
        
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")));
        
        System.out.println(element.isDisplayed());
        
        element.submit();
  
        

        
        browser.close();
    }
}
