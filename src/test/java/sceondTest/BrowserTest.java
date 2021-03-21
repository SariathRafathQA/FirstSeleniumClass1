package sceondTest;

import firstSelenium.FirstSeleniumClass1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserTest extends FirstSeleniumClass1 {
    @Test
    public void test1() throws InterruptedException {
        init();
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Sariath@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='email']")).clear();
    }
}
