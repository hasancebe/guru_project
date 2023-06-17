package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Guru99;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class day02 {
    /*
    Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
          5) Verify the title
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


        String expectedTitle="Guru99 Bank Manager HomePage";
        String actualTite=Driver.getDriver().getTitle();
        System.out.println(actualTite);
        Assert.assertTrue(actualTite.contains(expectedTitle));


        Driver.closeDriver();
    }

}
