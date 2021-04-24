package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ScriptBass {
    public WebDriver driver;



    @BeforeTest
    public void init() {
        String browser = "firefox";
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("http://automationpractice.com/index.php");
       // driver.quit();

    }
}
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
//         driver = new ChromeDriver();
//        driver.get("http://automationpractice.com/index.php");
//        //driver.quit();


//    @Test
//
//    public void getout(){
//        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://automationpractice.com/index.php");
//        driver.quit();
//
//
//    }
//    @Test
//    public void webmanager(){
//        WebDriverManager.iedriver().setup();
//        WebDriver driver = new InternetExplorerDriver();
//        driver.get("http://automationpractice.com/index.php");
//    }
//
//
//}
