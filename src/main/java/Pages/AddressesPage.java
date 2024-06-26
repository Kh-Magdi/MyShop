package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressesPage {

    public WebDriver driver;
    private By ProceedBtn = By.xpath("//button[@name='processAddress' and @class='button btn btn-default button-medium']");

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShippingPage ClickOnProceedBtn() {
        driver.findElement(ProceedBtn).click();
        return new ShippingPage(driver);
    }
}
