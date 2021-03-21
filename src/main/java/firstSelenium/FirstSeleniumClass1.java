package firstSelenium;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass1 {
   // @Test
    public WebDriver driver;
    public void init(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
         driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        //driver.quit();
    }

    @Test

    public void getout(){
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();


    }
    @Test
    public void webmanager(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://automationpractice.com/index.php");
    }


}
