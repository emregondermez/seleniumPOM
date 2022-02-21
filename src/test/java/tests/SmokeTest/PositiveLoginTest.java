package tests.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
    //1) com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()
    //		 https://www.hotelmycamp.com adresine git
    //		login butonuna bas
    //test data username: manager ,
    //test data password : Manager1!
    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    HotelMyCampPage hotelMyCampPage;
    @Test
    public void positiveLoginTest() {
        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLoginButton.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"), Keys.TAB,ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();

        Assert.assertTrue(hotelMyCampPage.managerButton.isEnabled());

        Driver.closeDriver();
    }
}
