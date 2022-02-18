package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class E2ETesting {

    @Test
    public void e2eTesting() throws InterruptedException {
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //	a. Username : manager
        //	b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisyap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCampPage.hotelManagementButton.click();
        hotelMyCampPage.hotelListButton.click();
        hotelMyCampPage.addHotelButton.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker = new Faker();

        System.out.println(faker.number().digits(4));


        hotelMyCampPage.createHotelPageCodeBox.sendKeys(faker.number().digits(4));




        hotelMyCampPage.createHotelPageCodeBox
                .sendKeys(faker.address().zipCode(),
                        Keys.TAB,
                faker.name().name()
                        , Keys.TAB,
                faker.address().fullAddress()
                        , Keys.TAB,
                faker.phoneNumber().cellPhone()
                        , Keys.TAB,
                faker.internet().emailAddress()
                        , Keys.TAB);

        Select select = new Select(hotelMyCampPage.selectIdGroup);
        select.selectByVisibleText("Hotel Type2");



        //--> Site de problem var
        //        hotelMyCampPage.createHotelPageCodeBox.sendKeys(Keys.PAGE_DOWN);
//        hotelMyCampPage.addHotelSaveButton.click();
//
//        Thread.sleep(5000);
//
//        Assert.assertTrue(hotelMyCampPage.successfullySaved.isEnabled());
    }
}
