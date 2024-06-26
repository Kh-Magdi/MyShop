package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {

    public WebDriver driver;
    protected By ConfirmBtn = By.xpath("//span[text()='I confirm my order']");

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderConfirmationPage clickOnConfirm() {
        driver.findElement(ConfirmBtn).click();
        return new OrderConfirmationPage(driver);
    }
}
