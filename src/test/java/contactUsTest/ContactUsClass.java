package contactUsTest;

import base.ScriptBase;
import controller.ContactUsController;
import org.testng.annotations.Test;

public class ContactUsClass extends ScriptBase {
    ContactUsController contactUsController;

    @Test
    public void contactUsButtonTest() {
        contactUsController = new ContactUsController(driver);
        contactUsController.contactUsButton();
    }
    @Test
    public void contactUsButtonTest1() {
        contactUsController = new ContactUsController(driver);
        contactUsController.dropDownButton(driver);
    }
    @Test
    public void contactUsButtonTest2() {
        contactUsController = new ContactUsController(driver);
        contactUsController.InputValues();
    }
    @Test
    public void contactUsButtonTest3() {
        contactUsController = new ContactUsController(driver);
        contactUsController.inputMessage();
    }
    @Test
    public void contactUsButtonTest4() {
        contactUsController = new ContactUsController(driver);
        contactUsController.sendButton();
    }
}

