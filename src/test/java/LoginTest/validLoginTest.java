package LoginTest;

import base.ScriptBass;
import controller.LogInController;
import org.testng.annotations.Test;

public class validLoginTest extends ScriptBass {

  LogInController logInController;
  @Test
  public void verifyLoginInputProperly(){
    logInController = new LogInController(driver);
    logInController.logInValidation();

  }
}
