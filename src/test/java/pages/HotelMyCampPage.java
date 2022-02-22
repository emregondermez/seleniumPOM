package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;



public class HotelMyCampPage {

    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLoginButton;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement incorrectPassword;

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerButton;


    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "//a[@href=\"/admin/HotelAdmin\"]")
    public WebElement hotelListButton;
    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement createHotelPageCodeBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement selectIdGroup;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement addHotelSaveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfullySaved;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;




    public void girisyap() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginButton.click();

        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"),Keys.TAB,ConfigReader.getProperty("HMCValidPassword"));
        loginButton.click();

    }


}

