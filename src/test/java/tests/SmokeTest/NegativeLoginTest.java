package tests.SmokeTest;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    // 1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //				- yanlisSifre
    //				- yanlisKulllanici
    //				- yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    @Test (priority = 1)
    public void negativeLoginTest() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));


        hotelMyCampPage.ilkLoginButton.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"), Keys.TAB,ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButton.click();

        Assert.assertTrue(hotelMyCampPage.incorrectPassword.isEnabled());
        Driver.closeDriver();
    }
    @Test(priority = 2)
    public void negativeLoginTest2() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLoginButton.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"),Keys.TAB,ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.incorrectPassword.isEnabled());

        Driver.closeDriver();
    }

}
