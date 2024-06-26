package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    public WebDriver driver;

    private By ProceedToCheckOut = By.linkText("Proceed to checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public AddressPage clickOnProceed() {
        driver.findElement(ProceedToCheckOut).click();
        return new AddressPage(driver);
    }
}
