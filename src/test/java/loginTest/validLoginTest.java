package loginTest;

import base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.Test;

public class validLoginTest extends ScriptBase {

  @Test
  public void verifyLoginInputProperly(){

    LoginController logInController = new LoginController(driver);
    logInController.logInValidation();

  }
}
