package tests;

import org.testng.annotations.Test;
import pages.Guru99;
import utilities.ConfigReader;
import utilities.Driver;

public class day01 {
    /*
    Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
     */
    @Test
    public void test01 (){
        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));
        Guru99 guru99=new Guru99();
        guru99.user_Id.click();
        guru99.user_Id.sendKeys(ConfigReader.getProperty("userValidId"));
        guru99.password.click();
        guru99.password.sendKeys(ConfigReader.getProperty("validUserPassword"));
        guru99.loginButton.click();
    }
}
