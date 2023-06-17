package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Guru99;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class day03 {
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));
        Guru99 guru99=new Guru99();
        guru99.user_Id.click();
        guru99.user_Id.sendKeys(ConfigReader.getProperty("userInvalidId"));
        guru99.password.click();
        guru99.password.sendKeys(ConfigReader.getProperty("validUserPassword"));
        guru99.loginButton.click();

        String expectedAlertMessage="User or Password is not valid";
        String actualAlertMessage = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }

    @Test
    public void test02(){
        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));
        Guru99 guru99=new Guru99();
        guru99.user_Id.click();
        guru99.user_Id.sendKeys(ConfigReader.getProperty("userValidId"));
        guru99.password.click();
        guru99.password.sendKeys(ConfigReader.getProperty("InvalidPassword"));
        guru99.loginButton.click();

        String expectedAlertMessage="User or Password is not valid";
        String actualAlertMessage = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
    @Test
    public void test03(){
        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));
        Guru99 guru99=new Guru99();
        guru99.user_Id.click();
        guru99.user_Id.sendKeys(ConfigReader.getProperty("userInvalidId"));
        guru99.password.click();
        guru99.password.sendKeys(ConfigReader.getProperty("InvalidPassword"));
        guru99.loginButton.click();

        String expectedAlertMessage="User or Password is not valid";
        String actualAlertMessage = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}
