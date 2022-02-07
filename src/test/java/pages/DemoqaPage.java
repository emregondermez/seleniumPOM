package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {

    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

@FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement headers;


    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> basliklarListesi;

    @FindBy(xpath = "//div[@class='ReactTable -striped -highlight']")
    public WebElement tumListe;
}
