package sceondTest;

import base.ScriptBass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserTest extends ScriptBass {
    @Test
    public void test1() throws InterruptedException {
        init();
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("//*[@id='email']")).sendKeys("Sariath@gmail.com");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Sr248");
        driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='email']")).clear();
        WebElement element= driver.findElement(By.xpath("//*[@id='contact-link']/a"));
        element.isDisplayed();
        System.out.println(element.getText());
    }
}
