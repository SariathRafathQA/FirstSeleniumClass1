package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsController {
    @FindBy(xpath = "//*[@id='contact-link']/a")
    WebElement contactUsButton;
    @FindBy(id = "email")
    WebElement inputEmail;
    @FindBy(id = "id_order")
    WebElement inputReference;
    @FindBy(id = "message")
    WebElement message;
    @FindBy(xpath = "//*[@id='submitMessage']/span")
    WebElement sendButton;
    public ContactUsController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void contactUsButton(){
        contactUsButton.click();
    }
    public void dropDownButton( WebDriver driver){
        Select dropDown= new Select(driver.findElement(By.xpath("//*[@id='id_contact']")));
        String option= "1";
        dropDown.selectByValue(option);
    }
    public void InputValues(){
        inputEmail.sendKeys("rafath@gmail.com");
        inputReference.sendKeys("3456789");
    }
    public void inputMessage(){
        message.sendKeys("Welcome To Selenium World");

    }
    public void sendButton(){
        sendButton.click();
    }
}
